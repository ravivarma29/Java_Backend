package com.functionalinterfaces;

@FunctionalInterface
//public interface AutoMobile extends Vehicle {    //this is used for dynamic 
	public interface AutoMobile extends Vehicle {

	default void airbags()
	{
		System.out.println("4 airbags ..");
	}
	
	static void headLights()
	{
		System.out.println("always turned on...");
	}
}
	