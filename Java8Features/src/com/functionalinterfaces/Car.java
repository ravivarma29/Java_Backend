package com.functionalinterfaces;

public class Car implements Vehicle,AutoMobile {

	@Override
	public void start() {
		System.out.println("Car started....");
	}

}
