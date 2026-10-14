package com.ravi;

import com.Test;

public class Test4 extends Test{
	 public static void main(String[] args) {
		Test4 test = new Test4();
		System.out.println(test.a);
		test.testPublicMethod();
		test.testProtectedMethod(); // because we have Inherited Test method
	}

}
