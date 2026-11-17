package com;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

//import com.entity.Orders;
import com.entity.Products;
import com.util.HibernateUtil;

public class Apllication {
	
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
//		createProducts(session);
		
//		Orders orders = new Orders(2,30,500);
//		Products products = new Products("Mobile","Electronics");  -- create new products
		
		session.beginTransaction();
		Products products = session.find(Products.class, 3);
		products.setCategory("Electronics Gadget");
		session.merge(products);
		session.getTransaction().commit();
		session.close();
	
		
		
	}

	private static void createProducts(Session session) {
		session.beginTransaction();
		Products products = new Products("Mobile","Electronics"); 
		session.persist(products);
		session.getTransaction().commit();
		session.close();
	}

}
