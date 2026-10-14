package com.embeddable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.Car;
import com.entity.CarId;
import com.util.HibernateUtil;

public class Application {
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		
		CarId carId = new CarId(123, 456);
		
		Car car1 = new Car(carId,"Safari","Tata",250000);
		
		session.persist(car1);
		
		session.getTransaction().commit();
		
	}

}
