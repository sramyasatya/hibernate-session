package com.ramya.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ramya.bean.Department;
import com.ramya.bean.Emp;
import com.ramya.bean.Student;

public class OnetoOneMapping {

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
	        	
	        	//create object
	        	Department dept=new Department(4,"It", null);
	        	Emp emp=new Emp(1008,"prasad",67000.00d,dept);
	        	
	        	//retrieve employee whose id is 1001
	        	session.beginTransaction();
	        	/*
	        	 * below lines are to read the content
	        	 * 
	        	 * Emp emp=session.get(Emp.class,1001);
	        	System.out.println(emp.getEmpName());
	        	System.out.println(emp.getSalary());
	        	
//	        	Department dept=emp.getDepartment();
//	        	System.out.println(dept.getDeptId());
//	        	System.out.println(dept.getDeptName());*/
	        	
	        	session.save(emp);
	        	session.getTransaction().commit();
	       }
	        finally {
	        	session.close();
	        	factory.close();
	       }
		}
	
}


