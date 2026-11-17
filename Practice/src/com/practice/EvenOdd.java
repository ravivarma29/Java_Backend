package com.practice;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		if(num==0)
		{
			System.out.println(num + " Neither Even or Odd Number");
		}
		else if(num%2==0) {
			System.out.println(num + " Even Number");
		}
		else {
			System.out.println(" Odd Number");
		}
			
	}

}
