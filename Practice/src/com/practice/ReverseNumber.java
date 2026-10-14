package com.practice;

import java.util.Scanner;

public class ReverseNumber {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	
	//rev=0 ,
	//num=1234 , digit=4 , rev=(0*10)+4
	//num=123 , digit=3 ,  rev=(4*10)+3
	//num=12, digit=2  rev=(43*10)+2 (debug the code )
	//num=0, digit=1  rev=(432*10)+1
	//rev 4321
	int num=sc.nextInt();
	int rev=0;
	while(num!=0)
	{
		int digit=num%10;
		num=num/10;
		rev=(rev*10)+digit;	
	}
	System.out.println(rev);
}
}
