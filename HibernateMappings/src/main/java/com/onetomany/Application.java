package com.onetomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.Order;
import com.entity.User;
import com.util.HibernateUtil;

public class Application {
	
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		
//		insertOperation(session);
		 User user = session.find(User.class, 2);
		 System.out.println(user);
		 System.out.println(user.getOrders()); 
		
	}

	private static void insertOperation(Session session) {
		Order order1 = new Order(123,2000,10);
		Order order2 = new Order(452,1500,9);
		Order order3 = new Order(348,7500,6);
		Order order4 = new Order(458,1500,7);
		
		List<Order> orders = new ArrayList<Order>();
		orders.add(order1);
		orders.add(order2);
		orders.add(order3);
		
		
		List<Order> orders2 = new ArrayList<Order>();
		orders.add(order4);
		
		User user1 = new User("Ravi",12456315,orders);
		User user2 = new User("Akash",65421353,orders2);
		
		order1.setUser(user1);
		order2.setUser(user1);
		
		order3.setUser(user2);
		order4.setUser(user2);
		
		session.beginTransaction();
		session.persist(user1);
		session.persist(user2);
		session.getTransaction().commit();
	}

}
