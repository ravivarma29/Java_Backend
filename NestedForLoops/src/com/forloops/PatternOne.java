package com.forloops;

public class PatternOne {
	// 0 1 2 3 4 
	// 1 * * * *
	// 2 * * * *
	// 3 * * * *
	// 4 * * * *
	
public static void main(String[] args) {
	for(int i=0;i<=3;i++)
	{	
		for(int j=0;j<=3;j++)
		{
			System.out.print("*");
		}
		System.out.println(" ");
	}
}
}
