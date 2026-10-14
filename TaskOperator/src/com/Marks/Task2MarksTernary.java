package com.Marks;

import java.util.Scanner;

public class Task2MarksTernary {
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the marks ");
	int marks=sc.nextInt();
	String grade=(marks>=90 && marks <=100)? "Grade A"
			: (marks >=80 &&  marks < 89) ? "Grade B"
			: (marks >=70 && marks <79) ? "Grade C" 
			: (marks >=60 && marks <69) ? "Grade D" 
			: (marks >=0 && marks <59) ? "Fail" 
			: "Invalid Marks" ;
	System.out.println(grade);
	}
}
