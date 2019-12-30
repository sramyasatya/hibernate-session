package com.ramya.bean;

import javax.persistence.*;

@Entity
@Table(name="student")
@SecondaryTable(name="student_details")
public class Student {

	@Id
	@GeneratedValue
	private int rollNo;
	
	@Column(table="student")
	private String studentName;
	@Column(table="student_details")
	private int age;
	
	//constructors
	public Student() {}
	
	public Student(int rollNo, String studentName, int age) {
		super();
		this.rollNo = rollNo;
		this.studentName = studentName;
		this.age = age;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
