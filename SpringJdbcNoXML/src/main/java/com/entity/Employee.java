package com.entity;

public class Employee {
	
	int emp_Id;
	
	String name;
	
	int salary;

	public int getEmp_Id() {
		return emp_Id;
	}

	public void setEmp_Id(int emp_Id) {
		this.emp_Id = emp_Id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [emp_Id=" + emp_Id + ", name=" + name + ", salary=" + salary + "]";
	}

	public Employee(int emp_Id, String name, int salary) {
		super();
		this.emp_Id = emp_Id;
		this.name = name;
		this.salary = salary;
	}
	
	
	

}
