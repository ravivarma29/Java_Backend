package com;

public class Car {
	public static void main(String[] args) {
		String color;
		String model;
		String company;
		int price;
		
	}
	void drive() {
		System.out.println("car in  Driving State ");
	}
	void gearUp() {
		int speed=10;
		System.out.println(" Gear up ");
	}
	void gearDown() {
		System.out.println("Gear Down ");
	}
	void speed() {
		System.out.println("Car speed is increasing ");
	}
	void accelerate() {
		speed();
		System.out.println("Car acceleration ");
	}
}
