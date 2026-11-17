package com.arfoods;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class PaymentConsumer {
	
	@KafkaListener(topics="payments" , groupId = "payment-group")
	public void	 receivedPayment( String message)
	{
		System.out.println("Received Message"+ message);
	}

}
