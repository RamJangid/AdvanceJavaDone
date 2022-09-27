package com.simplilearn.xml.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class XHibernateUtil 
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
