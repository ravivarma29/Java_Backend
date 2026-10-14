package com;

public class Test {
	public static void main(String[] args) 
	{
		
//		Parent p = new Parent();
//		System.out.println(p.a);
//		p.m1();
//
//		Child child = new Child();
//		System.out.println(child.b);
//		child.m2();
//		child.m1();
//
//		System.out.println("-----");
//		System.out.println("Child class a " + child.a);
	
	Car c=new Car();
	c.start();
	c.drive();
	
	FuelCar fc=new FuelCar();
	System.out.println("----Fuel car-----");
	fc.start();
	fc.start();
	fc.filled();
	
	System.out.println("----hierarcial Inheritance---");
	EvCar ev=new EvCar();
	ev.start();
	ev.drive();
	ev.charging();
	
	}
}
