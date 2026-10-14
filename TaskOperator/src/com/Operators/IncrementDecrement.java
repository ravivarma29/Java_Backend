package com.Operators;

public class IncrementDecrement {
public static void main(String[] args) {
	short a=100;
	short b=-50;
	boolean isCheck=true;
	System.out.println(a+100);
	System.out.println(b-100);
	System.out.println(!isCheck);
	int res = a++ + ++a; //100 + 102= 202
	System.out.println(res);
	a=100;
	int res1= --a + a--; //99 +99 =198
	System.out.println(res1);
	int r = b++ + ++b; //-50 + -48 =-98
	System.out.println("the value of r is " + r);
	b=-50;
	int r1= --b + b--; // 51 +(-51)=-102
	System.out.println(" the value of r1 is " +r1);
}
}
