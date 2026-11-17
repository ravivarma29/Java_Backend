package com.Twod;
import java.util.Scanner;

public class PracticeTwoD {
	public static void main(String[] args) {
		//create a jagged array 
		//take inputs  dyamically from user
		//print back all values in matrix
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("enter array elemnets");
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.println(arr[i]);
			}
		}
		
		
	}

}
