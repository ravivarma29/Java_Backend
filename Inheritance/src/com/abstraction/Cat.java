package com.abstraction;

public class Cat extends Animal{
	@Override
	public void sound()
	{
		System.out.println("Meow Meow");
	}
	
	@Override
	public void sleep()
	{
		System.out.println("Cat is sleeping");
	}

	@Override
	public void numOfLegs() {
		System.out.println("It has Four Legs");
		
	}
	
}
