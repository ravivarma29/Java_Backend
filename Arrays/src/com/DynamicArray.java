package com;

import java.util.Scanner;

public class DynamicArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array Size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("enter Array elements");
				for(int i=0;i<size;i++)
		{
					System.out.println("Enter " + i+" Value");
			arr[i]=sc.nextInt();	
		}
		for(int i=0;i<size;i++){
			System.out.print(arr[i]);
		}
		/*
		 * System.out.println(arr[0]); System.out.println(arr[1]);
		 */
	
		
	}

}
