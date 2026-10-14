package com.methods;

public class ParamaterMethod {
	public static void main(String[] args) {
		ParamaterMethod p=new ParamaterMethod();
		int value = p.sum(6,9);
		System.out.println(value);
		int value1=p.sum(10, 30);
		System.out.println(value1);
	}

	int sum(int a, int b) {
		int res=a+b;
		return res;
	}
}
