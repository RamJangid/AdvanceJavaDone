package com.simplilearn.ahibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;




public class CustomerClient {

	public static void main(String[] args) 
	{
		SessionFactory factory;
		Transaction tx= null;

		try
		{
			//1. Create the Configuration Object
			Configuration cfg= new Configuration();
			System.out.println("1. Create the Configuration Object");

			//2. Call the Configure Object
			cfg=cfg.configure();
			System.out.println("2. Call the Configure Object");

			//3. Through the Configuration object call the buildSessionFactory
			factory=cfg.buildSessionFactory();
			System.out.println("3.Through the Configuration object call the buildSessionFactory");

			//4. With the factory object open the session
			Session session=factory.openSession();
			System.out.println("4. With the factory object open the session");

			//5. With the help of Session need to begin the transaction
			tx=session.beginTransaction();
			System.out.println("5. With the help of Session need to begin the transaction");
			
			
			//Customer customer = new Customer("Tony", "tony@gmail.com", 12345, "Pune", 10000000);
			Customer customer = new Customer("Rahul", "rahul@gmail.com", 12345, "Pune", 1000000);
			
			//Customer customer = new Customer("Triple", "TripleH@gmail.com", 123456, "Pune", 100000000);
			
			//6. Save the data
			session.save(customer);
			System.out.println("6. Save te data in session object");
			
			//7. Commit the tx
			tx.commit();
			System.out.println("Commit in to DB");
			
			//9. close the session
			session.close();
			
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
