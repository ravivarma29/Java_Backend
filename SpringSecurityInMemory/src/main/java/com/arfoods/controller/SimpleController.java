package com.arfoods.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
	
	@GetMapping("/hi")
	public String hi()
	{
		return "hi";
	}
	
	@GetMapping("/bye")
	public String bye()
	{
		return "bye";
	}
	
	@GetMapping("/open")
	public String open()
	{
		return "open";
	}
	
	
	@GetMapping("/noAccess")
	public String noAccess()
	{
		return "not Accesible";
	}
	

}
