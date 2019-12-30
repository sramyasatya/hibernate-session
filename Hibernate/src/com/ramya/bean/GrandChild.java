package com.ramya.bean;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class GrandChild extends Child{

	@Column(name="grandchild_id")
	private int grandChildId;
	@Column(name="grandChild_Name")
	private String grandChildName;
	
	public GrandChild() {
//		super();
	}
	
	public GrandChild(int grandChildId, String grandChildName) {
//		super();
		this.grandChildId = grandChildId;
		this.grandChildName = grandChildName;
	}
	
	public int getGrandChildId() {
		return grandChildId;
	}
	public void setGrandChildId(int grandChildId) {
		this.grandChildId = grandChildId;
	}
	public String getGrandChildName() {
		return grandChildName;
	}
	public void setGrandChildName(String grandChildName) {
		this.grandChildName = grandChildName;
	}
	
	
}
