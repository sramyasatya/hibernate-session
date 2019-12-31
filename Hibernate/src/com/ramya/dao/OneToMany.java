package com.ramya.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ramya.bean.College;
//import com.ramya.bean.Department;
//import com.ramya.bean.Emp;
//import com.ramya.bean.Student;
import com.ramya.bean.Studentcoll;
public class OneToMany{
	
		public static void main(String args[])
		{
			SessionFactory factory=new Configuration()
					.configure("hibernate.cfg.xml")
					.addAnnotatedClass(Studentcoll.class)
					.addAnnotatedClass(College.class)
					.buildSessionFactory();
			
			Session session=factory.getCurrentSession();
			
	        try
	       {
	        	College college=new College();
				college.setCollegeId(100);
				college.setCollegeName("abc");
				Studentcoll std1=new Studentcoll(01,"sumi",college);
				Studentcoll std2=new Studentcoll(02,"abi",college);
				
				//add students to college
				college.getStudentcoll().add(std1);
				college.getStudentcoll().add(std2);
				//BeginTransaction
				session.beginTransaction();
				//save object
				session.save(college);
				session.save(std1);
				session.save(std2);
				//commit 
				session.getTransaction().commit();
	        	
	       }
	        finally {
	        	session.close();
	        	factory.close();
	       }
		}
	
}
