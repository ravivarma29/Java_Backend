package com.arfoods.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
	
	@Autowired
	KafkaTemplate<String , String> kafkafkaTemplate;
	
	public String sendPayment(String message)
	{
		kafkafkaTemplate.send("payments", message);
		System.out.println("Payment Event Published");
		return "Payment notification Sent";
		
	}

}
