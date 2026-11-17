package com.practice;

import java.util.Scanner;

public class AllPrimeNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		AllPrimeNumbers p=new AllPrimeNumbers();
		p.PrimeNumbers(num);
	}
	void PrimeNumbers(int num)
	{
		int count=0,number=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0) {
				count++;
			}
		}
			if(count==2)
			{
				System.out.println(num+ " is a Prime Number");
			}
			else
			{
				System.out.println(num+ " is not a Prime Number");
			}
	}

}
