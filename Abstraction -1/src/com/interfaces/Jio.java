package com.interfaces;

public class Jio implements Trai,Sim{

	@Override
	public void calling() {
		System.out.println("Unlimited calling ");
		
	}

	@Override
	public void data() {
		System.out.println("5G");
		
	}

	@Override
	public void sms() {
		System.out.println("100 sms/Day");
		
	}
	public void internataionalRoaming()
	{
		System.out.println("Unlimited Roaming");
	}

	@Override
	public void dataCalling() {
		System.out.println("564");
		
	}

	@Override
	public void Data() {
		System.out.println("10GB");
		
	}

}
