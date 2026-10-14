package com.lamda1;

public class Main {

	public static void main(String[] args) {
		
		Animal animal = new Lion();
		animal.walk();
		animal.sound();
		
//		Anonymous Inner Class
		Animal dog = new Animal() {
			
			@Override
			public void walk() {
				System.out.println("walks with 4 Legs");
				
			}
			@Override
			public void sound() {
				System.out.println("Barks..");	
				
			}
			//it is child class we can't access
			void sleep()
			{
				System.out.println("sleeping");
			}
		};
		
		dog.walk();
		dog.sound();
//		dog.sleep();
	}
}
