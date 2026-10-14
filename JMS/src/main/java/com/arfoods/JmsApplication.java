package com.arfoods;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.arfoods.model.Credentials;

import io.micrometer.core.aop.CountedAspect;
import io.micrometer.core.aop.TimedAspect;
import io.micrometer.core.instrument.MeterRegistry;

@SpringBootApplication
@EnableConfigurationProperties(Credentials.class) 
public class JmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(JmsApplication.class, args);
	}

	public TimedAspect timedAspect(MeterRegistry meterRegistry)
	{
		return new TimedAspect();
	}
	
	public CountedAspect countedAspect(MeterRegistry meterRegistry)
	{
		return new CountedAspect();
	}
	
	 
}
