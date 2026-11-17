package com.ternary;

public class TernaryOperator {
	public static void main(String[] args) {
		String s=(10>5)? "10 is bigger Number" :"5 is Bigger Number";
		System.out.println(s);
		int n=20;
		int n1=10;
		String s1=(n>n1)?(n +" is Bigger Number"):(n1+ "is smaller Number");
		System.out.println(s1);
		boolean isPositive=	(10>5)?true:false;
		System.out.println(isPositive);
	}

}
