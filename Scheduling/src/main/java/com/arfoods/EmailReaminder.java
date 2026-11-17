package com.arfoods;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class EmailReaminder {
	
	@Scheduled(cron ="*/10 * * * * * ")
	public void sentMail() {
		
		System.out.println("Email Sent " );
	}

}
