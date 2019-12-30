package com.ramya.dao;

import java.util.List;
import java.util.ListIterator;
import com.ramya.bean.Customer;


import org.hibernate.*;
import org.hibernate.cfg.*;
//import java.awt.List;
//import java.util.List;
public class WhereCustomer {
	public static void main(String args[])
	{
		SessionFactory factory=new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Customer.class)
				.buildSessionFactory();
		
		Session session=factory.getCurrentSession();
		
        try
       {
        	session.beginTransaction();
        	
        	//List<Customer> c=session.createQuery("from Customer where email='test123@yahoo.com'").getResultList();
        	//List <Customer> c=(List<Customer>) session.createQuery("from Customer where email LIKE 'test%' ").getResultList();
        	//List <Customer> c=(List<Customer>) session.createQuery("from Customer order by name").getResultList();
        	List <Customer> c=(List<Customer>) session.createQuery("from Customer order by name").getResultList();
        	 ListIterator<Customer> iterator = c.listIterator(); 

        	while(iterator.hasNext())
        	{
        		Customer c1=iterator.next();
        		System.out.println(c1.getEmail()+" = "+ c1.getName());
        	}
       }
        finally
    	{
    		session.close();
    		factory.close();
    	}
}
}