package com.practice;
import java.util.Scanner;

public class NumberofDigitsRev {
	public static void main(String[] args) {
		// number of digits in a number in reverse order 
		//546
		//6
		//4
		//5    
		// 845%10= 5     , 845/10=84
		// 84%10= 4     , 84/10=8
		// 8%10= 8     , 8/10=0
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		while(num!=0) {
		int digit=num%10;
		num =num/10;
	    System.out.println(digit);
		}
	}
}
