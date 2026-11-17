package com.arfoods.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.arfoods.service.PaymentService;

@RestController
@RequestMapping("/payments")
public class TestController {
	
	@Autowired
	PaymentService paymentService;
	
	
	@GetMapping("/send")
	public String payment(@PathVariable(name="message") String message)
	{
		return paymentService.sendPayment(message) ;
	}

}
