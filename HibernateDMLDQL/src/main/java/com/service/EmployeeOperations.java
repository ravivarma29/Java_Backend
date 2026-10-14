package com.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.Employee;
import com.util.HibernateUtil;

public class EmployeeOperations {
	
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		
//		select(session);
//		deleteOperation(session);		
//		updateOperation(session);
			
		
	}

	private static void updateOperation(Session session) {
		session.beginTransaction();
		Employee emp = session.find(Employee.class, 1);
		emp.setSalary(20000);
		
		session.merge(emp);
		session.getTransaction().commit();
	}

	private static void deleteOperation(Session session) {
		// Delete ->remove
		session.beginTransaction();
		Employee employee = new Employee(2,"",0);
		session.remove(employee);
		session.getTransaction().commit();
	}

	private static void select(Session session) {
		//DQL
		Employee employee = session.find(Employee.class,1);
		
		System.out.println(employee);
	}

}
