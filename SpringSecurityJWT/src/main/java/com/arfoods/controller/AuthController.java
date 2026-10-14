package com.arfoods.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arfoods.dao.PersonRepository;
import com.arfoods.model.Person;
import com.arfoods.security.JWTService;

import ch.qos.logback.core.subst.Token;


@RestController
@RequestMapping("/auth")
public class AuthController {
	
	@Autowired
	PersonRepository personRepository;
	
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	@Autowired
	AuthenticationManager authenticationManager;
	
	@Autowired
	JWTService jwtservice;
	
	@PostMapping("/signup")
	public Person signUp(@RequestBody Person person)
	{
		String encodedPassword = passwordEncoder.encode(person.getPassword());
		person.setPassword(encodedPassword);	
		Person savedPerson = personRepository.save(person);
		return savedPerson;
	}
	
	@PostMapping("/login")
	public ResponseEntity<String> login(@RequestBody Person person)
	{
		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(person.getUserName(), person.getPassword()));
		}
		catch(Exception ex)
		{
		return 	ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid Credentials");
		}
		
		String token = jwtservice.generateToken(person.getUserName());
		return ResponseEntity.ok(token);
	}

}
