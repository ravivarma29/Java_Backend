package com.arfoods.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.arfoods.dao.PersonRepository;
import com.arfoods.model.Person;


public class CustomUserDetails implements UserDetailsService {

	@Autowired
	PersonRepository personRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		
		Person person = personRepository.findPersonByUserName(username);
		
		UserDetails userDetails = User.builder()
			.username(person.getUserName())
			.password(person.getPassWord())
			.build();
		
		return userDetails;
	}
	
	

}
	