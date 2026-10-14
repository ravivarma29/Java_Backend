package com.arfoods.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {
	
	@Autowired
	JavaMailSender javaMailSender;
	
	@GetMapping("/email")
	public String sendEmail(@RequestParam(name="toEmail") String toEmail)
	{
		SimpleMailMessage mail = new SimpleMailMessage();
		
		mail.setFrom("arvpatel6@gmail.com");	
		mail.setTo(toEmail);
		mail.setSubject("Enrolled Successfully");
		mail.setText("Congratulations for successfully enrolled in JavaFullStack Course");
		mail.setCc("raviakula398@gmail.com");
		
		javaMailSender.send(mail);
	
		return "Mail Sent Succesfully";
	}

}
