package com.ramya.bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Department {

	
	@Id
	    @Column(name="dept_id")
	    private int deptId;
	    @Column(name="dept_name")
		private String deptName;
		
	    @OneToOne(mappedBy="department",cascade=CascadeType.ALL)
	    private Emp emp;
	  
	    public Department() {
			super();
		}

		public Department(int deptId, String deptName,Emp emp) {
			super();
			this.deptId = deptId;
			this.deptName = deptName;
			this.emp = emp;
		}
		
		
		public int getDeptId() {
			return deptId;
		}
		public void setDeptId(int deptId) {
			this.deptId = deptId;
		}
		public Emp getEmp() {
			return emp;
		}
		public void setEmp(Emp emp) {
			this.emp = emp;
		}
		public String getDeptName() {
			return deptName;
		}
		public void setDeptName(String deptName) {
			this.deptName = deptName;
		}
		public Emp getEmployee() {
			return emp;
		}
		public void setEmployee(Emp emp) {
			this.emp = emp;
		}

		
}
