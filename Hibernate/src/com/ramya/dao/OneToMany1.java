package com.ramya.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ramya.bean.Cart;
import com.ramya.bean.Items;
public class OneToMany1{
	
		public static void main(String args[])
		{
			SessionFactory factory=new Configuration()
					.configure("hibernate.cfg.xml")
					.addAnnotatedClass(Cart.class)
					.addAnnotatedClass(Items.class)
					.buildSessionFactory();
			
			Session session=factory.getCurrentSession();
			
	        try
	       {
	        	//to set values
	 
	        		Cart cart=new Cart();
	        		cart.setCartId(5000);
	        		cart.setCartName("watches");
	        		cart.setCartTotal(4);
	        		
//	        		Items item=new Items();
	        		Items item0=new Items(04,511,7,cart);
	        		Items item5=new Items(05,221,5,cart);
	        		Items item6=new Items(06,023,2,cart);
	        		Items item7=new Items(07,100,6,cart);
	        		
	        		cart.getItem().add(item0);
	        		cart.getItem().add(item5);
	        		cart.getItem().add(item6);
	        		cart.getItem().add(item7);
	        		
	        		session.beginTransaction();
	        		
	        		session.save(cart);
           		    session.save(item0);
           		    session.save(item5);
           		    session.save(item6);
           	     	session.save(item7);
        		
	        		//commit 
            		session.getTransaction().commit();
	        		
	        	}
	        	
	        finally {
	        	session.close();
	        	factory.close();
	       }
		}
	
}