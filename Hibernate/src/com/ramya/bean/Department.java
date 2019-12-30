package com.ramya.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Department {

	@Id
	    @Column(name="dept_id")
	    private int deptId;
	    @Column(name="dept_name")
		private String deptName;
		
		public Department() {
			super();
		}


		public Department(int deptId, String deptName) {
			super();
			this.deptId = deptId;
			this.deptName = deptName;
		}
		
		
		public int getDeptId() {
			return deptId;
		}
		public void setDeptId(int deptId) {
			this.deptId = deptId;
		}
		public String getDeptName() {
			return deptName;
		}
		public void setDeptName(String deptName) {
			this.deptName = deptName;
		}
		
}
