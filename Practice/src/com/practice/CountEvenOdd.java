package com.practice;

import java.util.Scanner;

public class CountEvenOdd {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int count=0;
		for(int i=1;i<=num;i++){
			if(i%2==0) {
				count++;
			}
		}
		System.out.println("number of EvenNumbers Count= " + 	count);
		System.out.println(count);
	}

}
	