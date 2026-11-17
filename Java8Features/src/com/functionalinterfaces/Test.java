package com.functionalinterfaces;

public class Test {

	public static void main(String[] args) {
		Vehicle vehicle = new Car();
		vehicle.start();
		vehicle.airbags();
		Vehicle.headLights();
		AutoMobile.headLights();
		
		Vehicle vehicle2 = new Bike();
		vehicle2 .start();
		vehicle2.airbags();
		Vehicle.headLights();
		
		
	}
}
