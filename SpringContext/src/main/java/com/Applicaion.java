 package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Address;
import com.model.User;

public class Applicaion {
	public static void main(String[] args) {
		
		ApplicationContext container = new ClassPathXmlApplicationContext("beans.xml");
		container.getBean("user" ,User.class);
			
		User user = container.getBean("user", User.class);
		System.out.println(user);
		
		Address address = container.getBean("address", Address.class);
		System.out.println(address);
		
		
	}

}
