package com.manytomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.Course;
import com.entity.Student;
import com.util.HibernateUtil;

public class Apllication {
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		
		Student st = new Student (123, "ravi",7845924584L);
		Student st2 = new Student (124,"Tarun",4584872617L);
		Student st3 = new Student (125,"Akas",78954123978L);
		
		Course course = new Course(1, "JFS",15000);
		Course course1 = new Course(2, "Devops",25000);
		Course course2 = new Course(3, "Python",18000);
		Course course3 = new Course(4, "Dotnet",16000);
		
		List<Student> student1 = new ArrayList<Student>();
		student1.add(st);
		student1.add(st2);
		
		List<Student> student2 = new ArrayList<Student>();
		student2.add(st);
		student2.add(st3);
		
		List<Course> courseList = new ArrayList<Course>();
		courseList.add(course);
		courseList.add(course1);
		
		List<Course> courseList1 = new ArrayList<Course>();
		courseList1.add(course2);
		courseList1.add(course3); 
		
		st.setCourses(courseList);
		st2.setCourses(courseList1);
		st2.setCourses(courseList1);
		
		
		session.beginTransaction();
		session.persist(st);
		session.persist(st2);
		session.persist(st3);
		session.getTransaction().commit();
	}

}
