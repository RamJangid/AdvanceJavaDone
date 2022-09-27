package com.myproject.hibernate.done;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CustomerClient {

	public static void main(String[] args) 
	{
		// All DB related code you will right here
		
		SessionFactory factory;
		Transaction tx = null;
		
		try
		{
			//1. Create the Configuration Object
			
			Configuration cfg = new Configuration();
			System.out.println("Create the Configuration Object");
			
			//2. Call the Configuration object
			
			cfg = cfg.configure();
			System.out.println("Call the Configuration object");
			
			//3. Through the Configuration object, call the buildSessionFactory
			
			factory = cfg.buildSessionFactory();
			System.out.println("Through the Configuration object, call the buildSessionFactory");
			
			//4. With the factory obj, open the session
			
			Session session = factory.openSession();
			System.out.println("With the factory obj, open the session");
			
			//5. With the session obj, need to begin the Transaction
			
			tx = session.beginTransaction();
			System.out.println("With the session obj, need to begin the Transaction");
			
			//6. Business object
			
			Customer customer = new Customer("Tony", "itsram@gmail.com", 1447774477, "Newyork", 10000000);
			System.out.println("Business Object prepared");
			//7. Save the data in DB
			
			session.save(customer);
			
			
			//8. Commit in to DB
			
			tx.commit();
			System.out.println("Commit the data");
			
			
			
		}
		catch(Exception e)
		{
			System.out.println("Custom msg "+e.getMessage());
			e.printStackTrace();
			if(tx!=null)
				tx.rollback();
		}
	}

}
