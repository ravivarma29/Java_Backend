package com.arfoods;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
	
	
	@GetMapping("/hi")
	public String Hi()
	{
		return "Hello";
	}

}
