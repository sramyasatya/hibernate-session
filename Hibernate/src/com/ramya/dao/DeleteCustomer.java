package com.ramya.dao;
import com.ramya.bean.Customer;
import org.hibernate.*;
import org.hibernate.cfg.*;
import java.awt.List;

public class DeleteCustomer {
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
//	     customer.setEmail("test@yahoo.in");
	     //update all customer details
//	     session.createQuery("update Customer set email='test123@yahoo.com'").executeUpdate();
	    //Update particular
	     session.delete(customer);
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
