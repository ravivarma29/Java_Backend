package com.customexception;

import java.util.Scanner;

public class Vote {

	public static void main(String[] args) {
	
	Scanner sc=null;
	try {
		sc=new Scanner(System.in);
		System.out.println("enter your age");
		int age=sc.nextInt();
		if(age>18)
		{
			System.out.println("Eligible to vote");
		}
		else
		{
			throw new InvalidAgeException("Age is below 18");
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
		//System.out.println(e);
	}
	finally
	{
//		System.out.println("finally");
		sc.close(); 
	}
	
	}
}
