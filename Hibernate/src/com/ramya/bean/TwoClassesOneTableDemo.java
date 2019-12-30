package com.ramya.bean;
import org.hibernate.*;
import org.hibernate.cfg.*;
//import java.awt.List;
import com.ramya.bean.Employee;
//import java.util.List;

//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;


public class TwoClassesOneTableDemo {

	public static void main(String args[])
	{
		SessionFactory factory=new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class)
				.addAnnotatedClass(EmployeeDetails.class)
				.buildSessionFactory();
		
		Session session=factory.getCurrentSession();
		
        try
       {
        	
        	//create object
        	EmployeeDetails empDetails=new EmployeeDetails(42,"chennaiOne");
        	//create employee object
        	Employee emp=new Employee();
        	emp.setEmpId(1002);
        	emp.setName("Raghavi");
        	emp.setSalary(55000.0);
        	emp.setEmpDetails(empDetails);
        	session.beginTransaction();
        	
        	session.save(emp);
        	session.getTransaction().commit();
       }
        finally {
        	session.close();
        	factory.close();
       }
	}
}