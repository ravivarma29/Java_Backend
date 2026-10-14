package com.object;

public class Test {
	public static void main(String[] args) {
		Employee emp1= new Employee(1, "Ravi");
		Employee emp2 = new Employee(2, "Varma");
		Employee emp3= new Employee(2, "Varma");
		
		//emp1 == emp2
		//equals
		boolean value = emp2.equals(emp3);
		System.out.println(value);
		
		
		// array
		// Set - unique values
		//Hashcode()
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		System.out.println(emp3.hashCode());
		
		//Tostring method
		System.out.println("ToStringMethod()");
		System.out.println(emp1);
		System.out.println(emp2);
		
	}

}
