package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.model.Student;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.model.Student;




@Component
@Transactional
public class StudentDAO {

    @Autowired
   public SessionFactory sessionFactory;

    public Student getStudent(int id) {
    	Session session = sessionFactory.getCurrentSession();
    	Student student = session.find(Student.class, id);
    	return student;
    }

    public void saveStudent(Student student) {
        Session session = getSession();
       session.persist(student);
    }

    public Session getSession() {
        Session session = sessionFactory.getCurrentSession();
        return session; 
    }
}