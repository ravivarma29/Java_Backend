package com.natives;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.NativeQuery;

import com.entity.Products;
import com.util.HibernateUtil;

public class NativeQueriesOperations {
	public static void main(String[] args) {
//		selectQuery(session);
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		NativeQuery<Products> nativeQuery = session.createNativeQuery("select * from Products where productId=?1",Products.class);
		nativeQuery.setParameter(1, 1);
		
		List<Products> list = nativeQuery.list();
		System.out.println(list);
	

	}

	private static void selectQuery(Session session) {
		NativeQuery<Products> nativeQuery = session.createNativeQuery("select * from Products", Products.class);
		
		List<Products> list = nativeQuery.list();
		System.out.println(list);
	}

}
