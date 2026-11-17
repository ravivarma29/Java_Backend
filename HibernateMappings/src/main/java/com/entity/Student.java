package com.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Student {
	
	@Id
	private int studentId;
	
	private String name;
	
	private long mobileNum;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name= "student_courses",
	joinColumns={@JoinColumn(name ="student_id")},
	inverseJoinColumns= {@JoinColumn(name="course_id")})
	private List<Course> courses;

	public Student(int studentId, String name, long mobileNum, List<Course> courses) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.mobileNum = mobileNum;
		this.courses = courses;
	}

	public Student() {
		super();
	}

	
	
	public Student(int studentId, String name, long mobileNum) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.mobileNum = mobileNum;
	}

	public Student(String name, long mobileNum, List<Course> courses) {
		super();
		this.name = name;
		this.mobileNum = mobileNum;
		this.courses = courses;
	}

	public Student(String name, long mobileNum) {
		super();
		this.name = name;
		this.mobileNum = mobileNum;
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

	public long getMobileNum() {
		return mobileNum;
	}

	public void setMobileNum(long mobileNum) {
		this.mobileNum = mobileNum;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", mobileNum=" + mobileNum + "]";
	}
	
	

}
