package com.simplilearn.hibernate.collections.done;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Employee_Clients {
	
	public static void main(String[] args) 
	{
		SessionFactory factory;
		Transaction tx =null;
		try
		{
			Configuration cfg= new Configuration();
			System.out.println("1. Create the Configuration Object");

			//2. Call the Configure Object
			cfg=cfg.configure();
			System.out.println("2. Call the Configure Object");

			//3. Through the Configuration object call the buildSessionFactory
			factory=cfg.buildSessionFactory();
			System.out.println("3.Through the Configuration object call the buildSessionFactory");
			
			Session session = factory.openSession();
			
			tx = session.beginTransaction();
			
			
			String[] empcourse = {"JAVA","JDBC","HIBERNATE","JSP"};
			
			List <String> empemails = new ArrayList<String>();
			
			empemails.add("a@gamil.com");
			empemails.add("b@gamil.com");
			empemails.add("c@gamil.com");
			empemails.add("d@gamil.com");
			
			List <Integer> empmarks = new ArrayList<Integer>();
			
			empmarks.add(86);
			empmarks.add(82);
			empmarks.add(95);
			empmarks.add(100);
			
			Set <Long> empphone = new HashSet<Long>();
			
			empphone.add(new Long(12345));
			empphone.add(new Long(12346));
			empphone.add(new Long(12347));
			empphone.add(new Long(12348));
			
			Map<String, Long> empreference = new HashMap<String, Long>();
			
			empreference.put("Roman Reign1", new Long(12341));
			empreference.put("Roman Reign2", new Long(12342));
			empreference.put("Roman Reign3", new Long(12343));
			empreference.put("Roman Reign4", new Long(12344));
			
			//just for reference to copy paste
//			private String[] empcourse;
//			private List <String> empemails;
//			private List <Integer> empmarks;
//			private Set <Long> empphone;
//			
//			private Map<String, Long> empreference;
			
			
			Employee employee = new Employee(121, "Triple", "010195", "MCA", empcourse, empemails, empmarks, empphone, empreference);
			
			session.save(employee);
			
			tx.commit();
			
			session.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			if(tx!=null) {
				tx.rollback();
			}	
		}
		
	}

}
