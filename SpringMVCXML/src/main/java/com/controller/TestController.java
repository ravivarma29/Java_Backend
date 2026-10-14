package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

//	<!-- end points   -->
	@RequestMapping("/hi")
	@ResponseBody
	public String hi() {
		return "Hi";	
	}
	
	
	@RequestMapping("/bye")
	@ResponseBody
	public String bye() {
		return "Bye Dude!!!";	
	}
	
}
