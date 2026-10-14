package com.streams;

public class Student {
	int studentId;
	
	String name;
	
	Department department;
	
	int marks;

	public Student(int studentId, String name, Department department, int marks) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.department = department;
		this.marks = marks;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
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
		return "Student [studentId=" + studentId + ", name=" + name + ", department=" + department + "]";
	}
	
	

}
