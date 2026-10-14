package com.arfoods.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arfoods.model.Person;
import java.util.List;


@Repository
public interface PersonRepository extends JpaRepository<Person , Integer> {
	
	
	Person findPersonByUserName(String Username);
	

}
