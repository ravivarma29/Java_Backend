package com.inheritance;

public class Test {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.id=20;
		System.out.println(p.id);
		p.m1();
	
		
		Child c= new Child();
		c.m2();
		c.m1();
		
		Test.main(16);
		
	}
	
	public static void main(int a)
	{
		
		System.out.println(a);
	}
}
