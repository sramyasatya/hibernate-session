package com.ramya.bean;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Child extends Parent{

	@Column(name="child_id")
	private int ChildId;
	@Column(name="child_name")
	private String ChildName;
	public Child() {
//		super();
	}
	public Child(int childId, String childName) {
//		super();
		ChildId = childId;
		ChildName = childName;
	}
	public int getChildId() {
		return ChildId;
	}
	public void setChildId(int childId) {
		ChildId = childId;
	}
	public String getChildName() {
		return ChildName;
	}
	public void setChildName(String childName) {
		ChildName = childName;
	}
	
}
