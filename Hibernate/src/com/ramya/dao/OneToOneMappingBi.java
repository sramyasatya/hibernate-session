package com.ramya.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ramya.bean.Department;
import com.ramya.bean.Emp;
import com.ramya.bean.Student;
public class OneToOneMappingBi {

		public static void main(String args[])
		{
			SessionFactory factory=new Configuration()
					.configure("hibernate.cfg.xml")
					.addAnnotatedClass(Emp.class)
					.addAnnotatedClass(Department.class)
					.buildSessionFactory();
			
			Session session=factory.getCurrentSession();
			
	        try
	       {
	        	session.beginTransaction();
	        	//create object
	        	//retrieve employee whose empid is... and dep details using bidirectional mapping
	        	Emp emp=session.get(Emp.class, 601);
	        	System.out.println(emp.getEmpName());
	        	System.out.println(emp.getDepartment());
	        	Department dept=emp.getDepartment();
	        	System.out.println(dept.getDeptId());
	        	System.out.println(dept.getDeptName());
	        	
	        	System.out.println("******************");
	        	//retrive employee and dept details using dept
	        	Department dept1=session.get(Department.class, 503);
	        	System.out.println(dept1.getDeptName());
	        	System.out.println(dept1.getEmp());
	        	
	        	
	        	Emp emp1=dept.getEmp();
	        	System.out.println(emp1.getEmpName());
	        	System.out.println(emp1.getSalary());
	        	
	        	//In bidirectional both depend on each other so we are using setters and getters instead of passing one insided the another
	     
	        	
	             	
	        	session.save(emp);
	        	session.getTransaction().commit();
	       }
	        finally {
	        	session.close();
	        	factory.close();
	       }
		}
	
}

/*Department dept=new Department();
	        	dept.setDeptId(503);
	        	dept.setDeptName("c");
	        	Emp emp=new Emp();
	        	emp.setEmpId(603);
	        	emp.setEmpName("x");
	        	emp.setDepartment(dept);
	        	dept.setEmp(emp);*/
