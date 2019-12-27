package com.ramya.bean;

import javax.persistence.*;

@Entity
//@Table(name="Customer")
public class Customer {
	@Id
	@GeneratedValue // used to insert multiple values.
	private int id;
	// @Column(name="")
	private String name;
	private String email;
	private long mobile;

//no arg constructor
	public Customer() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public Customer(String name, String email, long mobile) {
		this.name = name;
		this.email = email;
		this.mobile = mobile;
	}

//new Customer();
//new Customer("ram","ram@abc.com",2314543546);
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
