package com.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.Aadhar;
import com.entity.Citizen;
import com.util.HibernateUtil;

public class One2One {

	
	public static void main(String[] args) {
		
		
//		insert(session);
//		find(session);
//		delete(session);
//		getDetails(session);
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		Citizen citizen = session.find(Citizen.class, 4);
		System.out.println(citizen);
		
		
		
//		Aadhar aadhar = session.find(Aadhar.class, 123456);
//		System.out.println(aadhar);
//		System.out.println(aadhar.getCitizen());
	}

	private static void getDetails(Session session) {
		Aadhar aadhar = session.find(Aadhar.class, 123);
		System.out.println(aadhar);
		System.out.println(aadhar.getCitizen());
	}

	private static void delete(Session session) {
		session.beginTransaction();
		session.remove(new Citizen(2,null,0,null));
		session.getTransaction().commit();
	}

	private static void find(Session session) {
		Citizen citizen = session.find(Citizen.class, 2);
		
		System.out.println(citizen);
	}

	private static void insert(Session session) {
		Citizen citizen1 = new Citizen("ravi", 19, new Aadhar(12345,"XYZ"));
		
		session.beginTransaction();
		 session.persist(citizen1);
		 
		 session.getTransaction().commit();
	}
}
