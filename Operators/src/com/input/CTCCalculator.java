package com.input;
import java.util.Scanner;

public class CTCCalculator {
public static void main(String[] args) {
	
	//double salary=20000;
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the salary");
	double salary=sc.nextDouble();
	double providentFund=(12*salary)/100;
	double hra=(70*salary)/100;
	double allowance=(25*hra)/100;
	double ctc=salary+providentFund+hra+allowance;
	System.out.println("Final CTC " +ctc);
}
}
