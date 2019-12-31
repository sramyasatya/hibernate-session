package com.ramya.bean;

import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class College {

	@Id
	@Column(name="college_id")
	private int collegeId;
	@Column(name="college_name")
	private String collegeName;
	
	@OneToMany(targetEntity=Studentcoll.class,
			mappedBy="college",
			cascade=CascadeType.ALL,
			fetch=FetchType.LAZY)
	private List<Studentcoll> studentcoll=new ArrayList<Studentcoll>();
	


	public College() {
    }
	public College(int collegeId, String collegeName, List<Studentcoll> studentcoll) {
		super();
		this.collegeId = collegeId;
		this.collegeName = collegeName;
		this.studentcoll = studentcoll;
	}
	

	public int getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public List<Studentcoll> getStudentcoll() {
		return studentcoll;
	}
	public void setStudentcoll(List<Studentcoll> studentcoll) {
		this.studentcoll = studentcoll;
	}
	
}
