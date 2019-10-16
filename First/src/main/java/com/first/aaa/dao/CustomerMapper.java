package com.first.aaa.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.first.aaa.model.Customer;


/**
 * CustomerMapper.java
 * @author "Baniota"
 */
public class CustomerMapper implements RowMapper<Customer> {
	@Override
	public Customer mapRow(ResultSet rs, int count) throws SQLException {
		Customer cust = new Customer();
		cust.setName(rs.getString("name"));
		cust.setGender(rs.getString("gender").charAt(0));
		cust.setEmail(rs.getString("email"));
		cust.setBirthYear(rs.getInt("birthyear"));
		return cust;
	}			
}
