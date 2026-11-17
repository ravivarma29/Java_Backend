package com.comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		
		Student s= new Student(1, "Ravi");
		Student s1= new Student(2, "Anshu");
		Student s2= new Student(3, "Priya");
		Student s3= new Student(4, "Kiran");
		Student s4= new Student(5, "Sai");
		
		List<Student> students =new ArrayList<Student>();
		students.add(s);
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		
		System.out.println(s2);
		System.out.println(s1);
		
		
		Collections.sort(students);
		
		for(Student st : students) {
			System.out.println(st);
		}
	}	
	
	

}
