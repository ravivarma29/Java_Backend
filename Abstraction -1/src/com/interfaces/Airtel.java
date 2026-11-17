package com.interfaces;

public class Airtel implements Trai,Sim{

	@Override
	public void calling() {
		System.out.println("Airtel Limited calling");
	}

	@Override
	public void data() {
		System.out.println("airtel _1.5 GB/Day");
		
	}

	@Override
	public void sms() {
		System.out.println("50 SMS per day ");
		
	}

	@Override
	public void dataCalling() {
		System.out.println("485");
	}

	@Override
	public void Data() {
		System.out.println("6GB");
		
	}

	
}
