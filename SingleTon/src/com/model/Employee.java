package com.model;

public class Employee {
	
	private static Employee emp;
	
	
	private  Employee() {
		
	}

	public static Employee getEmployee() {
		if(emp==null) {
			emp = new Employee();
			return emp;
		}else
		{
			return emp;
		}
		
		
	}
}
