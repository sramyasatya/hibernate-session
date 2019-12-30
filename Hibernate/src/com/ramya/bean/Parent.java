package com.ramya.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="Parent")
//@Inheritance(strategy=InheritanceType.SINGLE_TABLE)//single table have all parent child and granddchild properties
//there are 3 types single table,joined,table per class
//if we give joined many table will be created
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Parent {

	@Id
	@Column(name="parent_id")
	private int parentId;
	@Column(name="parent_name")
	private String ParentName;
	public Parent() {
//		super();
	}
	public Parent(int parentId, String parentName) {
//		super();
		this.parentId = parentId;
		ParentName = parentName;
	}
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	public String getParentName() {
		return ParentName;
	}
	public void setParentName(String parentName) {
		ParentName = parentName;
	}
	
}
