package com.object;

import java.util.Objects;

public class Employee {
	int id;
	String name;
	
	Employee()
	{
		super();
	}
	
	public Employee(int id , String name)
	{
		this.id=id;
		this.name=name;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		Employee emp = (Employee) obj;
		return (this.id==emp.id) && (this.name.equals(emp.name)); // this.name.equals is String class
	}
	
	public int hashCode() {
		return Objects.hash(id , name);
		
	}
	
	@Override
	public String toString() {
		
		return this.id + " ," +this.name;
	}
}
