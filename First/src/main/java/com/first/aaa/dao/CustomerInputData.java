/************************************************************
 * 시스템 명 : 
 * 업무명 :
 * 프로그램명(ID) :
 * 프로그램 설명 :
 * 
 * 작성일 : 2018. 7. 5.
 * 작성자 : "Baniota"
 *
 * 수정자     수정일자     수정내역
 * ------    ----------    ---------------------------------
 * "Baniota"    2018. 7. 5.    최초 생성
 *
 ************************************************************/
package com.first.aaa.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.first.aaa.model.Customer;
import com.first.aaa.dao.CustomerMapper;

/**
 * CustomerInputData.java
 * @author "Baniota"
 */
public class CustomerInputData {

    //ArrayList<Customer> custList = new ArrayList<Customer>();
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
   public List<Customer> getcustList() {
	String sql = "select * from customer";
	return jdbcTemplate.query(sql, new RowMapper<Customer>() {
		@Override
		public Customer mapRow(ResultSet rs, int count) throws SQLException {
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~``");
			Customer cust = new Customer();
			cust.setName(rs.getString("name"));
			cust.setGender(rs.getString("gender").charAt(0));
			cust.setEmail(rs.getString("email"));
			cust.setBirthYear(rs.getInt("birthyear"));
			return cust;
		}
	});
  }	
   
   public void print(List<Customer> cust)
   {
	   for(int i=0;i<cust.size();i++)
	   {
	   System.out.println("이름"+cust.get(i).getName());
	   System.out.println("성"+cust.get(i).getGender());
	   }
			   
   }
   
   
   
   
   
   
   
}
