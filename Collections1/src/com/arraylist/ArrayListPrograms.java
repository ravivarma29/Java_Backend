package com.arraylist;

import java.util.ArrayList;

public class ArrayListPrograms {
	public static void main(String[] args) {
		ArrayList li = new ArrayList();
		li.add(1);
		li.add(10.8);
		li.add("Ravi");
		li.add("R");
		li.add(1);

			
		
		Employee emp = new Employee(1, "Ravi");
		li.add(emp);
		System.out.println(li);
//		System.out.println(li.get(1));			
		
		System.out.println(li.get(2));
		System.out.println(li);
		li.add(1, "My Value");
		System.out.println(li);
		li.set(3, 11);
		System.out.println(li);
		li.remove(3);
		
		System.out.println(li.contains("Ravi"));
		System.out.println(li.indexOf("A"));
		System.out.println(li.indexOf(1));
		System.out.println(li.lastIndexOf(1));
		System.out.println(li.size()	);
		
	}	
}


class Employee
{
	int EmpId;
	String name;	
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee()
	{
		
	}
	public Employee(int empId, String name) {
		super();
		EmpId = empId;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [EmpId=" + EmpId + ", name=" + name + "]";
	}
	
}