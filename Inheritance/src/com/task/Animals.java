package com.task;

public class Animals {
	public static void main(String[] args) {
		grassEatingAnimals ga=new grassEatingAnimals();
		ga.gender="male";
		grassEatingAnimals.legs=4;
		System.out.println(ga.gender);
		ga.Animals();
		ga.eatGrass();
		
		System.out.println("--Meat Eating Animals----");
		meatEatingAnimals ma=new meatEatingAnimals();
		ma.Animals();
		ma.killAnimals();
		
		
		
	}
	
	void Animals()
	{
		System.out.println("Parent Class");
	}

}
