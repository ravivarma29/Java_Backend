package com.util;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.entity.Aadhar;
import com.entity.Citizen;
import com.entity.Course;
import com.entity.Order;
import com.entity.Student;
import com.entity.User;


public class HibernateUtil {
	
	public static SessionFactory sessionFactory = null;

	public static SessionFactory getSessionFactory()
	{
		if (sessionFactory == null) {
			Configuration cfg = new Configuration();
			cfg.configure();
//			cfg.addAnnotatedClass(Aadhar.class);
//			cfg.addAnnotatedClass(Citizen.class);
			cfg.addAnnotatedClass(User.class);
			cfg.addAnnotatedClass(Order.class);
			cfg.addAnnotatedClass(Student.class);
			cfg.addAnnotatedClass(Course.class);
			
			sessionFactory = cfg.buildSessionFactory();
			return sessionFactory;
	
	}
	else
	{	
		return sessionFactory;
	}
		
	}
}
