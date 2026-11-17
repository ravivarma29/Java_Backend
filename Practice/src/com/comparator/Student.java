package com.comparator;

public class Student implements Comparable<Student>{
	private int id;
	
	private String name;
	
	public Student(int id , String name)
	{
		this.id=id;
		this.name=name;
	}
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}


// Compare To 
	public int compareTo(Student student)
	{
		return Integer.compare(this.id,student.id);
	}
}
