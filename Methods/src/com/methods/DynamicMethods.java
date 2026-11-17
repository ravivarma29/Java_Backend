package com.methods;

import java.util.Scanner;

public class DynamicMethods {
	public static void main(String[] args) {
		DynamicMethods d= new DynamicMethods();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the First Number");
		int num1=sc.nextInt();
		System.out.println("enter the Second Number");
		int num2=sc.nextInt();
		int value=d.sum(num1, num2);
		System.out.println(value);
	    double res1=sumOfTwo(num1,num2);
	    System.out.println(res1);
	}
	int sum(int a, int b)
	{
		int res= a+b;
		return res;
		
	}
	static double sumOfTwo(int c,int d) {
		System.out.println("sqaures");
		double squareOfA=Math.pow(c, 2);
			double squareOfB=Math.pow(d, 2);
			double res=squareOfA+squareOfB;
			return res;
		
	}
}
