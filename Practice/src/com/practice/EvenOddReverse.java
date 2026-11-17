package com.practice;

import java.util.Scanner;

public class EvenOddReverse {
	public static void main(String[] args) {
		 // print all even and odds from number to 1 in reverse order.
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		for(int i=num;i>=1;i--)
		{
			if(i%2==0) {
			System.out.println("Even " +i  );
		}
			else
			{
				System.out.println("Odd "+i);
			}
	}

	}
}
