package com.util;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Car;
import com.entity.Orders;
import com.entity.Products;


public class HibernateUtil {
	
	public static SessionFactory sessionFactory = null;

	public static SessionFactory getSessionFactory()
	{
	if(sessionFactory==null) {
		Configuration cfg = new Configuration();
		cfg.configure();
//		cfg.addAnnotatedClass(Orders.class);
		cfg.addAnnotatedClass(Products.class);
		cfg.addAnnotatedClass(Car.class);
		sessionFactory = cfg.buildSessionFactory();
		return sessionFactory;
	
	}
	else
	{	
		return sessionFactory;
	}
		
	}
}
