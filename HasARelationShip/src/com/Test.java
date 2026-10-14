package com;

public class Test {
	public static void main(String[] args) {
		
		Professor professor = new Professor();
		 professor.setExp(10);
		 professor.setName("Ravi");
		
		Department department = new Department();
		department.setDepartmentName("CSE");
		department.setNumOfStudents(100);
		department.setProfessor(professor);	
		
		System.out.println(department);
		
		//parameter Constructor s
		Professor professor2 = new Professor("XYZ", 15);
		Department department2 = new Department("ECE", 60 , professor2);
		System.out.println(department2);
		
		Department department3 = new Department("EEE",45 , new Professor("Varma",10));
		Professor professor3 =department3.getProfessor();
		System.out.println(professor3);
		//to get the professor name
		System.out.println(department.getProfessor().getName());
		
	}

}
