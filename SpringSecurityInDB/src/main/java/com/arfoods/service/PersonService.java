package com.arfoods.service;

import org.jspecify.annotations.Nullable;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.arfoods.dao.PersonRepository;
import com.arfoods.dto.PersonDetailsDTO;
import com.arfoods.dto.SignUpRequestDTO;
import com.arfoods.model.Person;

@Service
public class PersonService {
	
	@Autowired
	PersonRepository personRepository;
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	
	public PersonDetailsDTO signUp(SignUpRequestDTO signUpRequestDTO) {
		
		
		Person person = new Person();
		person.setUserName(signUpRequestDTO.getUserName());
		String password = signUpRequestDTO.getPassWord();
		
		String encodedPassword = passwordEncoder.encode(password);
		
		person.setPassWord(encodedPassword);
		
		Person savedPerson = personRepository.save(person);
		
		PersonDetailsDTO personDetailsDTO = new PersonDetailsDTO();
		
		BeanUtils.copyProperties(savedPerson, personDetailsDTO);
		
		return personDetailsDTO;
	}

}
