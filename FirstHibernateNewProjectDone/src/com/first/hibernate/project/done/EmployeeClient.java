package com.first.hibernate.project.done;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class EmployeeClient 
{
	

	public static void main(String[] args) 
	{
		SessionFactory factory = null;
		Transaction tx = null;
		
		try
		{
			Configuration cfg = new Configuration();
			
			cfg = cfg.configure();
			
			factory = cfg.buildSessionFactory();
			
			Session session = factory.openSession();
			
			tx = session.beginTransaction();
			
			Employee employee = new Employee("Tony", "tony@gmail.com", 12345, "Pune", 304);
			
			session.save(employee);
			
			tx.commit();
		}
		
		catch (Exception e) 
		{
			e.printStackTrace();
			if(tx!=null) {
				tx.rollback();
			}	
		}
	}

}
