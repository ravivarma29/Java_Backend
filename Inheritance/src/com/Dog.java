package com;

public class Dog extends Animal{
	String breed;
	int a=20;
	int b=25;
	
	
	Dog()
	{
		
		//It refers to the parameterised constructor
		this("Husky"); // this should be firstline of constructor
		System.out.println("Dog object is created");
		
	}
	
	Dog (String breed)
	{
		this.breed=breed;
		super.numOfLegs=4;
	}
	
	void print()
	{
		System.out.println(this.b);
		//System.out.println("this is Dog class");
		System.out.println("this is calling from Animal Class " +super.a);
	}
	
	void sound() {
		this.breed="Husky";	
		System.out.println(this.breed);
		System.out.println("Dog is Barking");
	}

}
	