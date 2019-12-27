package com.ramya.dao;

//import org.hibernate.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
//import javax.security.auth.login.Configuration;

import com.ramya.bean.Customer;

//import org.hibernate.SessionFactory;

//Ramya forgets passwo\|R?"D/'
public class AddCustomer {
public static void main(String args[])
{
	SessionFactory factory=new Configuration()
			.configure("hibernate.cfg.xml")
			.addAnnotatedClass(Customer.class)
			.buildSessionFactory();
	
	Session session=factory.getCurrentSession();
	
	try {
//		Customer customer =new Customer("Ram","ram@abc.in",231454356);
		Customer customer1 =new Customer("Ram1","ram1@abc.in",231454356);
		Customer customer2 =new Customer("sam","sam@abc.in",231454356);
		Customer customer3 =new Customer("jaanu","jaanu@abc.in",231454356);
		
		//create object
		session.beginTransaction();
		//start transaction
//		session.save(customer);
		session.save(customer1);
		session.save(customer2);
		session.save(customer3);
		
		//save objects into the database
		session.getTransaction().commit();
		//commit 
	}
	finally
	{
		session.close();
		factory.close();
	}
}
}
