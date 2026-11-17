package com.diffpatterns;

import java.util.Scanner;

public class PatternsTypes {
	public static void main(String[] args) {
/*      *
		* *
		* * *
		* * * *
		* * * * * */
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<i;j++)
			{
			//	System.out.println(j + " value");
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}

}
