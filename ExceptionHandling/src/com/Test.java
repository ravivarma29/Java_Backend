package com;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); // 
		int result=divide(20,10);
		System.out.println(result);
		try{
//		System.out.println("enter the first number");
//		int num1=sc.nextInt();
//		System.out.println("enter the second number");
//		int num2=sc.nextInt();
//		int num3= num1/num2;
//		System.out.println(num3);
		System.out.println("Hiii");
		}
		catch(ArithmeticException e)
		{
			 System.out.println("Don't pass zero value");
		}
		catch(InputMismatchException e)
		{
			 System.out.println("Invalid Value Passed");
		}
		catch(Exception e)
		{
			System.out.println(e);
		} 
		
		// we can create such exception but it is not recommended
//		catch(InputMismatchException | ArithmeticException e)
//		{
//			 System.out.println("Invalid Value Passed");
//		}
//		finally {
//			System.out.println("finally Executed");
//			sc.close();	
//		}
//		System.out.println("End...");	
	}
	
	// interview Question
	public static int divide(int a, int b)	
	{
		try {
			int res=a/b;
			return res;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally {
			System.out.println("Finally.....");
			return 1;
		}
	}

}
