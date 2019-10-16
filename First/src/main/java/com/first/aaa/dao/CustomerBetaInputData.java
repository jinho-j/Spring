package com.first.aaa.dao;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import java.io.*;

public class CustomerBetaInputData {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public void insertCustomerBetaData(Scanner scan) {
		System.out.print("이름 : ");	
		String name = scan.next();
		System.out.print("성별(M/F) : ");	
		char gender = scan.next().charAt(0);
		System.out.print("이메일 : ");	
		String email = scan.next();
		System.out.print("출생년도 : ");	
		int birthYear = scan.nextInt();
		System.out.print("Beta서비스 참여여부 : ");
		char attend = scan.next().charAt(0);
		writecustomerbeta("성명 : "+name+"이메일 : "+email+"출생년도 :"+birthYear+"\r\n");
		String sql = "insert into customerbeta (name, gender, email, birthYear, attend) values ('"+ name +"','"+gender+"','"+email+"','"+birthYear+"','"+attend+"')";
		jdbcTemplate.update(sql);
	}
	
	public void writecustomerbeta(String message)
	{
		
        File file = new File("C:\\beta\\beta.txt");
        FileWriter writer = null;
        try {
            // 기존 파일의 내용에 이어서 쓰려면 true를, 기존 내용을 없애고 새로 쓰려면 false를 지정한다.
            writer = new FileWriter(file, true);
            writer.write(message);
            writer.flush();  
        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(writer != null) writer.close();
            } catch(IOException e) {
                e.printStackTrace();
            }
        }
    }//end  writecustomerbeta



}// end CustomerBetaInputData



