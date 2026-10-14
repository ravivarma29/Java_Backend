package com.flmfoods.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.flmfoods.model.User;

@Controller
public class TestController {

	@GetMapping("/hi")
	public String hi() {
		return "hi";
	}

	@GetMapping("/himodel")
	public String hiModel(Model model) {
		User user = new User();
		model.addAttribute("user", user);
		return "hi";

	}

	@GetMapping("/data")
	public String data(Model model) {
		model.addAttribute("name", "Ravi");
		return "data";

	}

	@PostMapping("/login")
	public String login(@RequestParam String email, @RequestParam String password, Model model) {
		model.addAttribute("email", email);
		model.addAttribute("password", password);
		return "info";
	}

	@PostMapping("/loginModel")
	public String loginModel(@ModelAttribute User user, Model model) {
		model.addAttribute("email", user.getEmail());
		model.addAttribute("password", user.getPassword());
		return "info";
	}

	
	@GetMapping("/users")
	public String listUsers(Model model)
	{
		List<User> users = new ArrayList<>();
		
		users.add(new User("Ravi", "1234"));
		users.add(new User("Akash", "4562"));
		users.add(new User("Anshu", "6521"));
		users.add(new User("Priya", "4521"));
		model.addAttribute("userList",users);
		return "users";
		
	}
}
