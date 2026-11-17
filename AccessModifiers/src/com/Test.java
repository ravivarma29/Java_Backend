package com;

public class Test {
	public int a=10;
	private int b=13;
	protected int c=21;
	int d=40;
	
	public void testPublicMethod() //default method
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

	private void testPrivateMethod()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
	protected void testProtectedMethod()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
	
}
