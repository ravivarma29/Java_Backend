package com.arfoods.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arfoods.dto.PersonDetailsDTO;
import com.arfoods.dto.SignUpRequestDTO;
import com.arfoods.model.Person;
import com.arfoods.service.PersonService;

@RestController
@RequestMapping("/users")
public class PersonController {
	
	@Autowired
	private  PersonService personService;
	
	@PostMapping("/signup")
	public PersonDetailsDTO signUp(@RequestBody SignUpRequestDTO signUpRequestDTO)
	{
		return personService.signUp(signUpRequestDTO);
	}
	
	@GetMapping("/hi")
	public String hi()
	{
		return "Hi";
	}

}
