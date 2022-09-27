package com.simplilearn.hibernate.insert;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class StudentClientInsert 
{

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
			
			//Student student = new Student("Rahul", "rahul@gmail.com", 12345, "Pune", 100);
			Student student = new Student("Tony", "tony@gmail.com", 12345, "Pune", 100);
			
			//6. Save the data
			session.save(student);
			System.out.println("6. Save te data in session object");
			
			//7. Commit the tx
			tx.commit();
			System.out.println("Commit in to DB");
			
	
			//You can also get the data here in same class
			Student student1 = (Student)session.get(Student.class, 14);
			
			System.out.println(student1.getStuid()+" "+student1.getStuname()+" "+student1.getStuemail()+" "+
							   student1.getStuphone()+" "+student1.getStucity()+student1.getStumarks());
			
			Student student2 = (Student)session.get(Student.class, 15);
			
			System.out.println(student2.getStuid()+" "+student2.getStuname()+" "+student2.getStuemail()+" "+
					   student2.getStuphone()+" "+student2.getStucity()+student2.getStumarks());
			
			
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
