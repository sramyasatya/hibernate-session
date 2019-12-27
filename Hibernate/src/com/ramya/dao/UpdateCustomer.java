package com.ramya.dao;


	import com.ramya.bean.Customer;
	import org.hibernate.*;
	import org.hibernate.cfg.*;
	import java.awt.List;
	//import java.util.List;

	//import org.hibernate.Session;
	//import org.hibernate.SessionFactory;
	//import org.hibernate.cfg.Configuration;

	public class UpdateCustomer {
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
		     System.out.println("Transaction started");
		     //get cust using custId
		     Customer customer=session.get(Customer.class,custId);
		     //update all customer details
//		     customer.setEmail("test@yahoo.in");
		     //update all customer details
//		     session.createQuery("update Customer set email='test123@yahoo.com'").executeUpdate();
		    //Update particular
		     session.createQuery("update Customer set email='ab123@yahoo.com' where id=2").executeUpdate();
		    	 System.out.println("Updated customer email address");
		     session.getTransaction().commit();
		          
	         }
	        finally
	    	{
	    		session.close();
	    		factory.close();
	    	}
	}
	}



