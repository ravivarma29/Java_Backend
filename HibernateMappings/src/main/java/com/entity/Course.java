package com.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Course {
	
	@Id
	private int courseId;
	
	private String courseName;
	
	private double price;
	
	
	@ManyToMany(mappedBy = "courses",cascade = CascadeType.ALL) 
	private List<Student> students;


	public Course(int courseId, String courseName, double price, List<Student> students) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.price = price;
		this.students = students;
	}
	
	


	public Course(int courseId, String courseName, double price) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.price = price;
	}




	public Course(String courseName, double price, List<Student> students) {
		super();
		this.courseName = courseName;
		this.price = price;
		this.students = students;
	}


	public Course(String courseName, double price) {
		super();
		this.courseName = courseName;
		this.price = price;
	}


	public Course() {
		super();
	}


	public int getCourseId() {
		return courseId;
	}


	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}


	public String getCourseName() {
		return courseName;
	}


	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public List<Student> getStudents() {
		return students;
	}


	public void setStudents(List<Student> students) {
		this.students = students;
	}


	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", price=" + price + "]";
	}
	
	

	
}
