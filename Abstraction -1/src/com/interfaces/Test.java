package com.interfaces;

public class Test {
	public static void main(String[] args) {	

	Airtel airtel =new Airtel();
	airtel.calling();
	airtel.data();
	
	Jio jio = new Jio();
	jio.calling();
	jio.data();
		
	
	Sim sim=new Airtel();
	System.out.println("Dynamic Method Dispatch");
	sim.dataCalling();
	sim.Data();
	}
}
