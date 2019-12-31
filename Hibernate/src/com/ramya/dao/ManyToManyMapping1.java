package com.ramya.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ramya.bean.Author;
import com.ramya.bean.Books;
public class ManyToManyMapping1 {
			public static void main(String args[])
			{
				SessionFactory factory=new Configuration()
						.configure("hibernate.cfg.xml")
						.addAnnotatedClass(Author.class)
						.addAnnotatedClass(Books.class)
						.buildSessionFactory();
				
				Session session=factory.getCurrentSession();
				
		        try
		       {
		        
		        	//create object
		        	Author a1=new Author();
		        	a1.setAuthorId(111);
		        	a1.setAuthorName("aaa");
		        	Author a2=new Author();
		        	a2.setAuthorId(112);
		        	a2.setAuthorName("aab");
		        	Author a3=new Author();
		        	a3.setAuthorId(113);
		        	a3.setAuthorName("aac");
		        	Author a4=new Author();
		        	a4.setAuthorId(114);
		        	a4.setAuthorName("aad");
		            
					
		        	Books b1=new Books();
		        	b1.setBookId(1110);
		        	b1.setBookName("Wings of fire");
		        	Books b2=new Books();
		        	b2.setBookId(1120);
		        	b2.setBookName("Malala");
		        	Books b3=new Books();
		        	b3.setBookId(1130);
		        	b3.setBookName("vision");
		        	Books b4=new Books();
		        	b4.setBookId(1140);
		        	b4.setBookName("mission");
					
					
					
					//BeginTransaction
		        	session.beginTransaction();
					//add
					a1.getBook().add(b1);
					a2.getBook().add(b2);
					a3.getBook().add(b3);
					a4.getBook().add(b1);
					
					
					b1.getAuthor().add(a1);
					b1.getAuthor().add(a4);
					b2.getAuthor().add(a2);
					b3.getAuthor().add(a3);
					
				
					session.save(a1);
					session.save(a2);
					session.save(a3);
					session.save(a4);
					
					session.save(b1);
					session.save(b2);
					session.save(b3);
					
					//commit 
					session.getTransaction().commit();
		       }
		        finally {
		        	session.close();
		        	factory.close();
		       }
			}
		
	}

