package com.lamda;

public interface Calculator {
	
	int sum(int a,int b);
	
	default void subtract(int a, int b) {
		System.out.println(a-b);
	}
}
