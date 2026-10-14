package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.annotation.PostConstruct;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class UserController {

//	<!-- end points   -->
	@RequestMapping("/user")
	@ResponseBody
	public String hi() {
		return "Hi Ravi";	
	}
	
	@RequestMapping("/user")
	public String userData(Model model)
	{
		model.addAttribute("name","RAVI29");
		model.addAttribute("company", "FLM");
		return "user";
		
	}
	
	@RequestMapping("/data")
	public String data() {
		return "signup";
	}
	
	@PostMapping("/signup")
	public String signup(HttpServletRequest request,Model model)
	{
		String email = request.getParameter("email");
		
		String password = request.getParameter("password");
		model.addAttribute("email" , email);
		model.addAttribute("password" , password);
		return "data";
	}
}
