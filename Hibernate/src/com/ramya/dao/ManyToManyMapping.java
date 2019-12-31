package com.ramya.dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ramya.bean.Delegate;
import com.ramya.bean.Department;
import com.ramya.bean.Emp;
import com.ramya.bean.Event;
import com.ramya.bean.Student;

public class ManyToManyMapping {
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
		        	//BeginTransaction
		        	session.beginTransaction();
		        	//create object
		        	Delegate d1=new Delegate();
					d1.setDelegateId(301);
					d1.setDelegateName("Delegate1");
					Delegate d2=new Delegate();
					d2.setDelegateId(302);
					d2.setDelegateName("Delegate2");
					Delegate d3=new Delegate();
					d3.setDelegateId(303);
					d3.setDelegateName("Delegate3");
					Delegate d4=new Delegate();
					d4.setDelegateId(304);
					d4.setDelegateName("Delegate4");
					
					
					Event e1=new Event();
					e1.setEventId(501);
					e1.setEventName("Music");
					Event e2=new Event();
					e2.setEventId(502);
					e2.setEventName("Dance");
					Event e3=new Event();
					e3.setEventId(503);
					e3.setEventName("Comic");
					
					//add
					d1.getEvent().add(e1);
					d2.getEvent().add(e2);
					d3.getEvent().add(e3);
					d4.getEvent().add(e1);
					
					
					e1.getDelegate().add(d1);
					e1.getDelegate().add(d4);
					e2.getDelegate().add(d2);
					e3.getDelegate().add(d3);
					
				
					session.save(d1);
					session.save(d2);
					session.save(d3);
					session.save(d4);
					
					session.save(e1);
					session.save(e2);
					session.save(e3);
					
					//commit 
					session.getTransaction().commit();
		       }
		        finally {
		        	session.close();
		        	factory.close();
		       }
			}
		
	}

