package com.ramya.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="studentcoll")
public class Studentcoll {

	@Id
	@Column(name="roll_no")
	private int rollNo;
	@Column(name="student_name")
	private String studentName;
	
	@ManyToOne
	//coulmn to have eference to access college details
	@JoinColumn(name="college_id")
	private College college;
	
	
public Studentcoll() {	}
public Studentcoll(int rollNo, String studentName,College college) {
		super();
		this.rollNo = rollNo;
		this.studentName = studentName;
		this.college=college;
	}
public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}

	
}
