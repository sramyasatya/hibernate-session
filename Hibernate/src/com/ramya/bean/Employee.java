package com.ramya.bean;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="employee")
public class Employee {

	@Id
	private int empId;
	private String name;
	private double salary;
	
	public Employee() {

	}
	public Employee(int empId, String name, double salary,EmployeeDetails empDetails) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	
	@Embedded
	private EmployeeDetails empDetails;
	//Constructors
	//no arg constructor
	
	public EmployeeDetails getEmpDetails() {
		return empDetails;
	}
	public void setEmpDetails(EmployeeDetails empDetails) {
		this.empDetails = empDetails;
	}
	
	//getters and setters
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
