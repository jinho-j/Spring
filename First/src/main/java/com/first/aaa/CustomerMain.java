package com.first.aaa;
import com.first.aaa.controller.CustomerController;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.*;
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

/**
 * CustomerMain.java 
 * @author "Baniota"
 */

public class CustomerMain {
	public static void main(String[] args) {
		System.out.println("dsadasdas");
		AbstractApplicationContext context = new GenericXmlApplicationContext("application-config.xml");
		CustomerController custController = (CustomerController) context.getBean("custController");	
		custController.run("javaya");
	}
}
