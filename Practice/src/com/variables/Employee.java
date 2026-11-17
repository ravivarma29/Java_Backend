package com.variables;

public class Employee {
	
	int id;

	String name ;
	
	String companyName;
	
	
	void salary()
	{
		System.out.println("salary of employee");
		id=10;
		System.out.println("id of emp" +id);
	}
	
	static void address()
	{
		System.out.println("address");
		int id =35;
		System.out.println( " static method from address " +id);
	}

}
