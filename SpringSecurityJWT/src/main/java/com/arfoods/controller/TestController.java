package com.arfoods.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/hi")
	@PreAuthorize("hasAnyRole('ADMIN')")
	public String hi()
	{
		return "hi, you have valid ADMIN JWT";
	}
	
	public String bye()
	{
		return "Bye , you have valid SUPER ADMIN / ADMIN JWT";
	}
	 	 	 	
	@GetMapping("/revenue")
	public int revenue()
	{
		return 100000;
	}
		
	
	@GetMapping("/open")
	public String open()
	{
		return "you have valid JWT token";
	}
	
}
