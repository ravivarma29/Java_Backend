package com;
public class Marks {
	public static void main(String[] args) {
		//Marks of Students
		int teluguMarks=45;
		int englishMarks=98;
		int mathsMarks=99;
		
		int[] marks=new int[6];
		marks[0]=99;
		marks[1]=100;
		marks[3]=99;
		
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		System.out.println(marks[3]);
		System.out.println(marks[4]);
		
		
		char[] grades= {96,98,100,56};
		System.out.println("grades " + grades[3]);
		char[] grades1= {'A','B','C','D'};
		
		System.out.println(grades1[1]);
		System.out.println(grades1[2]);
		grades1[2]='E';
		System.out.println(grades1[2]);
	}

}
