package com.test;

import com.model.Employee;

public class Test {
	
	public static void main(String[] args) {
		Employee employee = getEmployee();
		System.out.println(employee.hashCode());
		Employee employee2 = getEmployee();
		System.out.println(employee2.hashCode());
	
		
	
	}
	
	public static Employee getEmployee() {
		Employee emp = Employee.getEmployee();
		return emp;
	}

}
