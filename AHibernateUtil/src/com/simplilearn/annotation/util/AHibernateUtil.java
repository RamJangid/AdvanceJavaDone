package com.simplilearn.annotation.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AHibernateUtil 
{
	static SessionFactory factory;
	
	static
	{
		Configuration cfg = new Configuration();
		cfg.configure();
		factory = cfg.buildSessionFactory();
	}
	
	public static SessionFactory getSessionFactory()
	{
		return factory;
	}

}
