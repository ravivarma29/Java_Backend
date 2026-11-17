package com.exception;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int res=0;
		try {
		System.out.println("Enter First number ");
		int num1 = sc.nextInt();
		System.out.println("Enter Second number ");
		int num2 = sc.nextInt();
		System.out.println(num2);
		
		res= num1/num2;
		System.out.println(res);
		}
		catch(Exception e)
		{
			System.out.println("Dont pass Zero");
		}	
		System.out.println("bye");
		
		
	}
	
	

}
