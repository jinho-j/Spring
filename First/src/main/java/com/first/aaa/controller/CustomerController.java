package com.first.aaa.controller;

import com.first.aaa.service.ICustomerService;

public class CustomerController {
	
	ICustomerService custService;

	public void setCustomerService(ICustomerService custService) {
		this.custService = custService;
	}
	
	public void run(String name) {
		
		System.out.println("HelloController : " + custService.run(name));
	}
	
	
}