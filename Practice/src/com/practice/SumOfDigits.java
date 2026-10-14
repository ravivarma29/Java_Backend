package com.practice;


import java.util.Scanner;

public class SumOfDigits {
public static void main(String[] args) {
	//123 , 
    //num%10=3 , num/10=12
	//num%10=2 , num/10=1
	//sum=sum+digit
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int num=sc.nextInt();
	int sum=0;
	while(num!=0)
	{
		int digit=num%10;
		num=num/10;
		sum =sum+digit;
	}
	 System.out.println(sum); 
	
}
}
