package com;

public class Employee {
	int id;
	String name;
	static String companyName;

	void start()
	{
		System.out.println("start");
	
    }
	static void stop()
	{
	companyName="CTS";	
	System.out.println(companyName);
	}
}