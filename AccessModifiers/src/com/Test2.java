package com;

public class Test2 {
	public static void main(String[] args) {
		Test test =new Test();
		//System.out.println(test.a);
		test.testPublicMethod();
		System.out.println("c Value" +test.c);
		test.testProtectedMethod();
	}

}
