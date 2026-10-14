package com.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsClass {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(25);
		list.add(5);
		list.add(78);
		
		
		System.out.println(list);
		System.out.println("<<<<<>>>>>");
		List<Double> list1 = new ArrayList<Double>();
		list1.add(10.8);
		list1.add(75.2);
		
		System.out.println(list1);
		
		
		
	}

}
