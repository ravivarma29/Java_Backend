package com.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsOperaions {
	
	public static void main(String[] args) {


//	ArrayList<Integer> list = new ArrayList<Integer>();   general way to create 
	
//	List<Integer> list = List.of(10,20,30,40,80);
	
	List<Integer> list1 = Arrays.asList(10,3,45,74,21,35,9,69);
	System.out.println(list1);
	
	// Collections
	Collections.sort(list1);
	System.out.println("Sort using Collections " + list1);
	
	Collections.reverse(list1);
	System.err.println("reverse array " + list1);
	
	Collections.shuffle(list1);
	System.out.println(list1);
	
	Collections.rotate(list1, 2);
	System.out.println(list1);
	
	Collections.swap(list1, 0, 2); // replace the INdex
	System.out.println(list1);
	
	Collections.replaceAll(list1, 10, 20);
	System.out.println(list1);
	
	}
	
}
