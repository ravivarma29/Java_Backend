 package com.arfoods.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arfoods.model.Person;

public interface PersonRepository extends JpaRepository<Person, Integer>{
	
	Person findPersonByUserName(String userName);	

}
	