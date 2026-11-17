package com.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.ArrayList;


public class StreamsOp1 {
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<Integer>(Arrays.asList(10,75,75,20,60,78,11,33));
		System.out.println(nums);
//		Stream<Integer> stream = nums.stream();
//		eveOrOdd(nums);
//		descSortedList(nums)
//		sortedList(nums);	
//	    employee();
//		salaryIncrement();
//		removeDuplicates
//		uniqueNames(employees);
//		 secondLargest(nums);
//		largestNumber(nums);
//		limiting(nums);
//		keyValues();
//		mapOpeartions(students);
//		valuesCondition(students);
//		sortedValues(students); 
//		sortingMaps();
//		terminalOperations(nums);
//		flatMap(words);
//	    parallelStream(nums);
//		allMatch(nums);
//		anyMatch(nums);
//		partitionbyMethod(nums);
//		highestNum(number);
//		reduceOpeations(nums);
		 
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(3,"Priya",20000));
		employees.add(new Employee(1,"Anshitha",30000));
		employees.add(new Employee(2,"Kiran",45000));
		employees.add(new Employee(4,"Ravi",75000));
		employees.add(new Employee(5,"Ravi",75000));
		
		Map<String,Integer> students =new HashMap<String , Integer>();
		students.put("Bharath", 100);
		students.put("Akhil", 96);
		students.put("Pavan", 93);
		students.put("Akash", 75);
		
		List<List<String>> words = new 	ArrayList<List<String>>();
		words.add(Arrays.asList("Hi"));
		words.add(Arrays.asList("GM","GA","GN"));
		words.add(Arrays.asList("1","2","3","4","5"));
		words.add(Arrays.asList("Bye"));
//		System.out.println(words);
		
		
		

	}

	private static void reduceOpeations(List<Integer> nums) {
		Integer reduceSum = nums
		 	 .stream()
		 	 .reduce(0 ,(a,b)->a+b); // sum all the values present in nums
			
		System.out.println("sum of the values " +reduceSum);
			List<Integer> number = Arrays.asList(10,20,35);
		 	 
			Integer product = number 
				 .stream()
				 .reduce(1, (a,b) -> a*b);
			System.out.println("multiply "+ product);
		
		
			List<Integer> num1 = Arrays.asList(10,20,35,-2,-11);
			Integer compare1 = num1  // 
					.stream() // Integer.MIN_VALUE
					.reduce(Integer.MIN_VALUE,(a,b) -> a > b ? a : b);
			System.out.println("Negative Numbers " + num1);
	// o/p i s  -2
			
			List<String> names1 = Arrays.asList("Harsha", "Ravi","Arun");
					String concat = names1 
							.stream()
							.reduce("", (a,b) -> a + " "+b)
							.trim();
					System.out.println(concat);
	}	

	private static void highestNum(List<Integer> number) {
		//compare
		// 0,10 =10
		// 10,20 =20
		//10,35 = 35
		Integer compare = number  // 
				.stream()
				.reduce(0 ,(a,b) ->a > b ? a : b);
		System.out.println("compare " +compare);
	}



	private static void partitionbyMethod(List<Integer> nums) {
		//partitioning by
		Map<Boolean, List<Integer>> evenOdd = nums 
				.stream()
				.collect(Collectors.partitioningBy(n->n%2 == 0));
		System.out.println(evenOdd);
	}



	private static void allMatch(List<Integer> nums) {
		boolean allMatch = nums 
				.stream()
				.allMatch(n-> n%5==0);	
				System.out.println(allMatch);
	}



	private static void anyMatch(List<Integer> nums) {
		boolean anyMatch = nums 
			.stream()
			.anyMatch(n-> n%3==0);	
			System.out.println(anyMatch);
	}



	private static void parallelStream(List<Integer> nums) {
		//parallel Stream
		nums	
				.stream()
				.forEach(n -> System.out.println("=============>"));
		nums 
		.parallelStream()
		.forEach(n -> System.out.println(n));
		System.out.println(nums);
	}



	private static void flatMap(List<List<String>> words) {
		List<String> list2 = words.stream()
		.flatMap(list -> list.stream())
		.toList();
		System.out.println(list2);
	}



	private static void terminalOperations(List<Integer> nums) {
		int sum = nums
			.stream()
			.mapToInt(n->n)
			.sum();	
		System.out.println("sum value " +sum);
		
			Integer max = nums 
					.stream()
					.mapToInt(n->n)
					.max()	
					.getAsInt(); 
			System.out.println("Max value " +max);
			
			int min = nums 
				.stream()
				.mapToInt(n->n)
				.min()
				.getAsInt();
			System.out.println("Min value " +min);
			
			long count = nums  
				.stream()
				.filter(n -> n%5==0)
				.count();
				System.out.println("count is " +count);
				
				Double average = nums 
						.stream()
						.mapToInt(n-> n)
						.average()
						.getAsDouble();
				System.out.println("average is "+ average);
	}



	private static void sortingMaps() {
		Map<String,Integer> students =new HashMap<String , Integer>();
		students.put("Bharath", 100);
		students.put("Akhil", 96);
		students.put("Pavan", 93);
		students.put("Akash", 75);
		   
		List<Integer> sortedValues = students 
		.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByValue())
		.map(entry ->entry.getValue())
		.toList();
		System.out.println(sortedValues);
	}



	private static void sortedValues(Map<String, Integer> students) {
		students 
					.entrySet()
					.stream()
					.sorted(Map.Entry.comparingByValue())
					.toList();
					System.out.println(students);
	}



	private static void valuesCondition(Map<String, Integer> students) {
		//values >95
		Map<String, Integer> map = students 
				.entrySet()
				.stream()
				.filter(entry -> entry.getValue()>95)
				.collect(Collectors.toMap(entry->entry.getKey(), entry-> entry.getValue()));
	System.out.println(map);
	}



	private static void mapOpeartions(Map<String, Integer> students) {
		Set<String> result = students 
				.entrySet()
				.stream()
				.filter(entry -> entry.getValue()>95)
				.map(entry->entry.getKey())
				.collect(Collectors.toSet());
		System.out.println(result);
	}



	private static void keyValues() {
		Map<String,String> students =new HashMap<String , String>();
		students.put("Bharath", "Hyderabad");
		students.put("Akhil", "Knr");
		students.put("Pavan", "Godavari");
		
								students
										.entrySet()
										.stream()
										.forEach(entry-> System.out.println(entry.getKey() + "-" +entry.getValue()));
		
								
								students
								.keySet()
								.stream()
								.forEach(key->System.out.println(key));
								
								
								students
								.values()
								.stream()
								.forEach(value->System.out.println(value));
	}



	private static void limiting(List<Integer> nums) {
		nums 
				.stream()
				 .limit(2)
				  .forEach(n-> System.out.println(n));
	}



	private static void largestNumber(List<Integer> nums) {
		//Largest Number
		Integer maxValue = nums 
								 .stream()
								 .sorted(Comparator.reverseOrder())
								 .findFirst()
								 .get();
	System.out.println(maxValue);
	}
	
		



	private static void secondLargest(List<Integer> nums) {
		//Second Largest Number
		Integer secondLargest = nums
										.stream()
										.sorted(Comparator.reverseOrder())
										 .skip(1)
										.findFirst()
										.get();
		System.out.println("2nd Largest " +secondLargest);
	}



	private static void uniqueNames(List<Employee> employees) {
		List<String> uniqueNames = employees
				.stream()
				.map( emp -> emp.getEmpName())
				.distinct()
				.toList();
		System.out.println(uniqueNames);
	}



	private static void removeDuplicates(List<Integer> nums) {
		List<Integer> removeDuplicates = nums
		.stream()
		.distinct()
		.toList();
		System.out.println(removeDuplicates);
	}



	private static void salaryIncrement() {
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1,"Ravi",30000));
		employees.add(new Employee(2,"Kiran",45000));
		employees.add(new Employee(3,"Priya",20000));
		employees.add(new Employee(4,"Anshitha",75000));
		System.out.println(employees);
//		employees.forEach(n->System.out.println(employees));
		
		List<Integer> empSalaries	=	employees
		 			.stream()
		 			.map(emp -> emp.getSalary() + 2000)
		 			.toList(); 	
		System.out.println(empSalaries);
	}



	private static void employee() {
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1,"Ravi",30000));
		employees.add(new Employee(2,"Kiran",45000));
		employees.add(new Employee(3,"Priya",20000));
		employees.add(new Employee(4,"Anshitha",75000));
		
		List<Employee> sortedList = employees
								  		        .stream()
//										  		        .sorted((emp1, emp2) -> emp1.getEmpName().compareTo(emp2.getEmpName()))
//										  		        .sorted((emp1, emp2) -> emp1.getSalary()-(emp2.getSalary()))	
								  		        .sorted((emp1,emp2) -> emp2.getEmpId()-emp1.getEmpId())
								  		        .toList(); // alternate to collect

  sortedList.forEach(n->System.out.println(n));
	}



	private static void sortedList(List<Integer> nums) {
		List<Integer> sortedList = nums
										  		.stream()
										  		.sorted()
										  		.collect(Collectors.toList());
					    System.out.println(sortedList);
	}



	private static void descSortedList(List<Integer> nums) {
		List<Integer> descSortedList = nums
									  		.stream()
									  		.sorted(Comparator.reverseOrder())
									  		.collect(Collectors.toList());
		System.out.println("descending order");
				System.out.println(descSortedList);
	}
	
	

	private static void eveOrOdd(List<Integer> nums) {
		List<Integer> evenNumbers = nums
				.stream()
				.filter(n-> n % 2 == 0)
				.collect(Collectors.toList());
		
				System.out.println(evenNumbers);
	}

}