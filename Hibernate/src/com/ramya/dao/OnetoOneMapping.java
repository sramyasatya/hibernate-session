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
	        	session.beginTransaction();
	        	//create object
	        	Department dept=new Department(1001,"It");
	        	Emp emp=new Emp(1001,"Ram.S",45000.00d,dept);
	        	
	        	session.save(emp);
	        	session.getTransaction().commit();
	       }
	        finally {
	        	session.close();
	        	factory.close();
	       }
		}
	
}


