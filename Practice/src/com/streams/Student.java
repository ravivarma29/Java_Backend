package com.streams;

public class Student {
	
	int stId;
	
	String name;
	
	Department department;

	public int getStId() {
		return stId;
	}

	public void setStId(int stId) {
		this.stId = stId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Student [stId=" + stId + ", name=" + name + ", department=" + department + "]";
	}

	public Student(int stId, String name, Department department) {
		super();
		this.stId = stId;
		this.name = name;
		this.department = department;
	}
	
	
	

}
