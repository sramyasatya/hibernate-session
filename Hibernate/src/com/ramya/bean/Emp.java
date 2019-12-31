package com.ramya.bean;

import javax.persistence.*;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Id;

@Entity
public class Emp {


	@Id
	@Column(name="emp_id")
	private int empId;
	@Column(name="Emp_name")
	private String empName;
	
	
	//cascade operation-all(merge,remove,detach...
	//FetchType-EAGER-loads both tables data at the time of retrieval
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="emp_dept")
	private Department department;
	
	public Emp() {
//		super();
	}

	public Emp(int empId, String empName, double salary, Department department) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.department = department;
	}


	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	private double salary;
	public int getEmpId() {
		return empId;
	}

	

	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
