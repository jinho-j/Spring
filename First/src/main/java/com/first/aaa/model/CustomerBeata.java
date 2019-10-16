package com.first.aaa.model;

public class CustomerBeata {
	private String name;
	private char gender;
	private String email;
	private int birthYear;
	private char attend;

	public CustomerBeata(String name, char gender, String email, int birthYear, char attend) {
		super();
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.birthYear = birthYear;
		this.attend = attend;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	public char getAttend() {
		return attend;
	}

	public void setAttend(char attend) {
		this.attend = attend;
	}
	
	@Override
	public String toString() {
		return "CustomerBeata [name=" + name + ", gender=" + gender + ", email=" + email + ", birthYear=" + birthYear + ",attend = " + attend +"]";
	}

}
