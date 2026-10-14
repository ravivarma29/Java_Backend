package com.functionalinterfaces;

@FunctionalInterface
public interface Vehicle {
	
	 void start();
	 
//	 default methods
	default void airbags() {
		System.out.println("2 airbags mandatory...");
	}
	
	// static methods
	static void headLights()
	{
		System.out.println("always turned on...");
	}
	 

}
