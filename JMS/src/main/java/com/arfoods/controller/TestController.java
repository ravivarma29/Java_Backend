package com.arfoods.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arfoods.model.Credentials;

import io.micrometer.core.annotation.Counted;
import io.micrometer.core.annotation.Timed;

@RestController
public class TestController {
	
	
	@Autowired
	Credentials credentials;
	
	@GetMapping("/creds")
	@Counted(value="credentials")
	@Timed(value =	"credentials.count")
	public Credentials getCredentials()
	{
		return credentials;
	}

}
