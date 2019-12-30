package com.ramya.bean;
import org.hibernate.*;
import org.hibernate.cfg.*;
//import java.awt.List;
import com.ramya.bean.Student;
//import java.util.List;

//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;


public class SingleClassTwoTable {
	public static void main(String args[])
	{
		SessionFactory factory=new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		Session session=factory.getCurrentSession();
		
        try
       {
        	session.beginTransaction();
        	//create object
        	Student std1=new Student();
        	std1.setStudentName("Ram");
        	std1.setAge(10);
        	std1.setStudentName("xyz school");
        	
        	
        	session.save(std1);
        	session.getTransaction().commit();
       }
        finally {
        	session.close();
        	factory.close();
       }
	}
}