package com.abs;

public class FuelCar implements Car {
	@Override
	public void start()
	{
		System.out.println("starting the car");
	}
	
	@Override
	public void stop()
	{
		System.out.println("Stopping the car");
	}

}
