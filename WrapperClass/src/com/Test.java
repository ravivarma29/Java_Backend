package com;

public class Test {
	public static void main(String[] args) {
		int a=10;
		Integer b = new Integer(10); //deprecated
		
		Integer c = Integer.valueOf(20);
		
		//java 5
		Integer d= Integer.valueOf(a);
		int e =c.intValue();
		
		//java 5
		Integer f=e;// e is primitive type to Wrapper type
		int g=f; //wrapper type  -> Primitive type
		
		Integer num= 10;
		String num1 ="20";
		System.out.println(num1+2);
		System.out.println(num+4);
		int num3=Integer.parseInt(num1+4);
		System.out.println(num3);
		
		System.out.println(Integer.max(10,17));
		 String num5 = String.valueOf(10);
		 System.out.println(num5+2);
		 
		 Character char1 = Character.valueOf('A');
		 System.out.println(char1);
		 System.out.println(Character.isUpperCase('C'));
		 System.out.println(Character.isLowerCase('D'));
		 System.out.println(Character.isDigit('1'));
		 System.out.println("Whitespace " +Character.isWhitespace('*'));
		
		
	}

}
