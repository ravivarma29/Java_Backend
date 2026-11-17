package com.model;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component

public  class Jio implements Sim {

	@Override
	public void call() {
		System.out.println("Jio calls....");
		}
	
	public Jio()
	{
		System.out.print("jio constructor calls");
	}
	
	@PostConstruct
	public void init()
	{
		System.out.print("Init called");
	}


}
