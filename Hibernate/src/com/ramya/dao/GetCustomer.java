package com.ramya.dao;

import com.ramya.bean.Customer;
import org.hibernate.*;
import org.hibernate.cfg.*;
import java.awt.List;
//import java.util.List;

//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;

public class GetCustomer {
	public static void main(String args[])
	{
		SessionFactory factory=new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Customer.class)
				.buildSessionFactory();
		
		Session session=factory.getCurrentSession();
		
        try
       {
        	//set customer id
	     int custId=2;
	     //begin transaction
	     session.beginTransaction();
	     //get cust using custId
	     Customer customer=session.get(Customer.class,custId);
	     //update
	     customer.setEmail("test@yahoo.in");
	     session.getTransaction().commit();
	     
	     
//	     Customer customers=session.get(Customer.class,custId);
//	     System.out.println(customer.getName()+":"+customer.getEmail());
	     
//	     List<Customer> itr=customers.iterator();
//	     while(itr.next())
//	     {
//	    	 Customer c=itr.next();
//	    	 System.out.println(c.getName()+":"+c.getEmail());
//	     }
//	     List<Customer> customers=session.createQuery("from Customer").getResultList();
//	     iterator itr
         }
        finally
    	{
    		session.close();
    		factory.close();
    	}
}
}









/*public static void main(String args[])
{
	SessionFactory factory=new Configuration()
			.configure("hibernate.cfg.xml")
			.addAnnotatedClass(Customer.class)
			.buildSessionFactory();
	
	Session session=factory.getCurrentSession();
	
    try
   {
    	//set customer id
     int custId=6;
     //begin transaction
     session.beginTransaction();
     
     Customer customer=session.get(Customer.class,custId);
     System.out.println(customer.getName()+":"+customer.getEmail());
     }
    finally
	{
		session.close();
		factory.close();
	}*/