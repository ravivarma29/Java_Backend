
package com.hibernate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Students {
	
	@Id
	private int stu_Id;
	
	private String name;
	
	private int marks;
	
	
	public int getstu_Id() {
		return stu_Id;
	}
	public void setstu_Id(int stu_Id) {
		this.stu_Id = stu_Id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setSalary(int salary) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Students [stu_Id=" + stu_Id + ", name=" + name + ", salary=" + marks + "]";
	}
	public Students(int stu_Id, String name, int salary) {
		super();
		this.stu_Id = stu_Id;
		this.name = name;
		this.marks = marks;
	}
	public Students(String name, int salary) {
		super();
		this.name = name;
		this.marks = marks;
	}
	

}
