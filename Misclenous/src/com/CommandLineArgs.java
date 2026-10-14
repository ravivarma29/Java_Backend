package com;

public class CommandLineArgs {
	
	// Command line Args
	public static void main(String[] args) {
		for(String val : args )
		{
			System.out.println(val);
		}
		
		sum(10,20,30);
	}
	
	// Var args
	public static void sum(int... nums)
	{
		int sum=0;
		for(int num : nums)
		{
			sum+=num;	
		}
		System.out.println(sum);
	}
	

}
