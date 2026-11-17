package com.functionalinterfaces;

public class Bike implements Vehicle{

	@Override
	public void start() {
		System.out.println("Bike started....");
		
	}
	
	@Override
	public void airbags()
	{
		System.out.println("No airbags for Bike");
	}
	
	
	 

}
