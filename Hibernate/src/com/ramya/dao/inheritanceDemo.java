package com.ramya.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ramya.bean.Child;
import com.ramya.bean.GrandChild;
import com.ramya.bean.Parent;

public class inheritanceDemo {

	public static void main(String args[])
	{
		SessionFactory factory=new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Parent.class)
				.addAnnotatedClass(Child.class)
				.addAnnotatedClass(GrandChild.class)
				.buildSessionFactory();
		
		Session session=factory.getCurrentSession();
		try
		{
		Parent p=new Parent(10,"Parent2");
		Child c=new Child(20,"Child2");
		//GrandChild gc=new GrandChild(301,"GrandChild");
		session.beginTransaction();
		session.save(p);
		session.save(c);
		//session.save(gc);
		session.getTransaction().commit();
		}
//        try
//       {
//       Parent p=new Parent();
//       p.setParentId(11);
//       p.setParentName("parent2");
//       Child c=new Child();
//       c.setParentId(101);
//       c.setParentName("Parent3");
//       c.setChildId(102);
//       c.setChildName("child2");
//       GrandChild gc=new GrandChild();
//       gc.setChildId(201);
//       gc.setChildName("child3");
//       gc.setGrandChildId(202);
//       gc.setGrandChildName("GrandChild2");
//       gc.setParentId(203);
//       gc.setParentName("Parent4");
//       session.beginTransaction();
//       session.save(p);
//       session.save(c);
//       session.save(gc);
//       }
        finally {
        	session.close();
        	factory.close();
        }
	}
}


/*  try
{
Parent p=new Parent(101,"Parent1");
Child c=new Child(201,"Child1");
GrandChild gc=new GrandChild(301,"GrandChild");
session.beginTransaction();
session.save(p);
session.save(c);
session.save(gc);
}*/