package com.ramya.bean;
import javax.persistence.*;
@Embeddable
public class EmployeeDetails {

	private int age;
	private String address;
	
	/**
	 * 
	 */
	public EmployeeDetails() {
		
	}

	/**
	 * @param age
	 * @param address
	 */
	public EmployeeDetails(int age, String address) {
		super();
		this.age = age;
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
}



