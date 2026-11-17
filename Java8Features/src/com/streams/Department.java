package com.streams;

public class Department {
	
	String department;
	
	
	@Override
	public String toString() {
		return "Department [department=" + department + "]";
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Department(String department) {
		super();
		this.department = department;
	}



}
