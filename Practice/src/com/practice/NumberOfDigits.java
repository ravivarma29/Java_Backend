package com.practice;
import java.util.Scanner;
import com.practice.*;

public class NumberOfDigits {
public static void main(String[] args) {
	//number of digits in a number 
	//456
	//456/10=>45   count=1;
	//45/10=4     count=2
	//4/10=0     count=3
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number");
	int num=sc.nextInt();
	int count=0;
	while (num!=0)
	{
		num=num/10;
		count++;
	}
	System.out.println(count);
}
}
