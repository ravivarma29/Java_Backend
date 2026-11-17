package com.multpleinheritance;

public class RangeRover implements Vehicle,Car{

	@Override
	public void start() {
		System.out.println("Range Rover Car is Started");
		
	}
	void stop()
	{
		System.out.println("Range Rover Car Stopped");
	}

}
