package com.arfoods.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arfoods.model.User;
import com.arfoods.repository.UserRepository;

@RequestMapping("/users")
@RestController
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	
	
	
	@PostMapping("/save")
	public User saveUser( User user)
	{
		return userRepository.save(user);
		
	}
	
	@GetMapping("/getusers")
	public List<User> getUSers()
	{
		return userRepository.findAll();
		
	}
	

}
