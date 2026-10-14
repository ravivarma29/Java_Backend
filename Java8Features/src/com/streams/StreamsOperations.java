package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsOperations {
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8));
		
		// for each 1)
		nums.forEach(n->System.out.println(n));
		
		
		//streams 2)
		Stream<Integer> stream = nums.stream();
		stream.forEach(n->System.out.println(n));
		// stream.forEach(n->System.out.println(n)); // streams can perform only one time
		
		System.out.println("stream 2");
		Stream<Integer> stream2 = nums.stream();
		stream2.forEach(ni-> System.out.println(ni));
		
		
		
		
		
	}	

}
