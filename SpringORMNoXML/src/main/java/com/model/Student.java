package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Students")
public class Student {

	
	@Id
	@Column(name="st_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int StudentId;
	
	@Column(name="st_name")
	private String studentName;
	
	private int marks;

	public int getStudentId() {
		return StudentId;
	}

	public void setStudentId(int studentId) {
		StudentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public Student(int studentId, String studentName, int marks) {
		super();
		StudentId = studentId;
		this.studentName = studentName;
		this.marks = marks;
	}

	public Student() {
		super();
	}

	@Override
	public String toString() {
		return "Student [StudentId=" + StudentId + ", studentName=" + studentName + ", marks=" + marks + "]";
	}
	
	
	
}
