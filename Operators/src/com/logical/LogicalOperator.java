package com.logical;

public class LogicalOperator {
	public static void main(String[] args) {
		
	boolean isMajor=true;
	boolean hasDrivingLicense= false;
	boolean hasAdhar=true;
	System.out.println(isMajor && hasDrivingLicense);
	// True && False
	//False
	System.out.println(isMajor || hasAdhar);
	// true || true
	// true
	System.out.println(!(!isMajor));
	// !false
	//true
	boolean l= (10>5) && (5<=10);
	// true && true
	//true
	System.out.println("The value of l is " + l);
	 
	boolean res= (10>5) || (5<=6) && (7>9);
	//Precedence (! > &&> ||)
	// T || T && F
	//T || F
	// T
	System.out.println("The value of res is " + res);
	
	System.out.println((7>=7) || (6<=6) && (5>6) || (2>13));
	// T || T && F || F
	//T || F ||F
	// T || F
	//T
	System.out.println((7>7) || (7<=7) || !false);
	//F || T || T
	// T || T
	// T
	}
}
