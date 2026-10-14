package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
	public static void main(String[] args) {
		

List<Integer> nums = new ArrayList<Integer>(Arrays.asList(12,45,21,78,20,31,4,9,86));

//sorted(nums);
// empDetails(employees);
// employee(employees);
//	maxvalue(nums);
//marksGreaterThan(students);
// sumOfValues(nums);
//maxInt(nums);
//flatMap(words);
//  parallelStream(nums);
//	allmatch(nums);
//anymatch(nums);
//evenOdd(nums);
//compare(nums);
//reduceHighestValues(nums);
//removeDuplicates();
//largelistToList();	
//listNames();
//removeSpacesInString();
// singleLetter();
//likeList();
// firstLetter();
//characterLetters();
//frequencyCharacters();
//noOfWordsInSentence();




System.out.println(nums);
 		 
 		 // custom operation
 		 
 		 List<Employee> employees = new ArrayList<Employee>();
 		 employees.add(new Employee(1, "Ravi", 10000));
 		 employees.add(new Employee(2,"ABC",45000));
 		 employees.add(new Employee(3,"CB",25000));
 		 

 		 
 		 // print employees name with length > 4 and salary > 15000
 		 
 		 Map<String, Integer> students = new HashMap<String, Integer>();
 		 students.put("Rahul", 100);
 		 students.put("Rohitl", 99);
 		 students.put("mani", 95);
 		 students.put("priya", 96);
 		 students.put("kajal", 92);
 		 students.put("Anshu", 94);
 		 
// 		  created Student and Department classes
// 		 within streams and executing the functionality
 		 
 		 List<Student> students1 = new ArrayList<Student>();
 		 
 		 Department dept1 = new Department("CSE");
 		 Department dept2 = new Department("MECH");
 		 
 		Student st1 = new Student(1, "Ravi", dept1);
 		Student st2 = new Student(2, "Anshu", dept2);
		Student st3 = new Student(3, "Priya", dept1);
		Student st4 = new Student(4, "Rekha", dept2);
		Student st5 = new Student(5, "das", dept1);
		Student st6 = new Student(6, "Kudas", dept2);
		
		students1.add(st1);
		students1.add(st2);
		students1.add(st3);
		students1.add(st4);
		students1.add(st5);
		students1.add(st6);
		
		studentDepartments(students1);

	}


	private static void studentDepartments(List<Student> students1) {
		Map<String, List<Student>> deptName = students1
		.stream()
		.collect(Collectors.groupingBy(
				stu -> stu.getDepartment().dept));
		System.out.println(deptName);
	}


	private static void noOfWordsInSentence() {
		String sentence = " Java Full Stack Developer Java";
		Map<Object, Long>  collect2 = Arrays.stream(sentence.split(" "))
		.collect(Collectors.groupingBy(
				word -> word,
				Collectors.counting()));
		System.out.println(collect2);
	}


	private static void frequencyCharacters() {
		// Character frequency
 		 //Grouping by
 		String name = "Programming";
 		 Map<Character,Long> count = name
 		.chars()
 		.mapToObj(c -> (char)c)
 		.collect(Collectors.groupingBy(
 				c-> c,
 				Collectors.counting()));
 		 System.out.println(count);
	}
	
//	 Grouping by 
	
	
	
	
	
	String name = "A!2B&3%C4";
	 String digit = name
	 .chars()
	 .filter(c->Character.isDigit(c))
	 .mapToObj( c-> String.valueOf((char)c))
	 .collect(Collectors.joining(","));
//	 System.out.println(digit);
	
	
	private static void characterLetters() {
		String name = "A!2B&3%C4";
 		 String character = name
 		 .chars()
 		 .filter(c->Character.isAlphabetic(c))
 		 .mapToObj( c-> String.valueOf((char)c))
 		 .collect(Collectors.joining());	
 		 System.out.println(character);
	}
	
	
	private static void firstLetter() {
		String sentence = "I Am A Java Developer Who Is Poor In Java";
 		 String[] words = sentence.split(" ");
 		 String firstLetterInSentence = Arrays
 		 .stream(words)	
 		 .map(word ->  String.valueOf(word.charAt(0)))
 		 .collect(Collectors.joining());
 		 System.out.println(firstLetterInSentence);
	}
	private static void likeList() {
		String name ="FRONT";
 		 String singleLetter = name
 		 .chars()
 		 .filter(c-> c!= '-')
 		 .mapToObj(c-> String.valueOf((char ) c))
 		 .collect(Collectors.joining(",","[","]"));
 		 System.out.println(singleLetter);
	}

	private static void singleLetter() {
		String name ="F-R-O-N-T";
 		 String singleLetter = name
 		 .chars()
 		 .filter(c-> c!= '-')
 		 .mapToObj(c-> String.valueOf((char ) c))
 		 .collect(Collectors.joining());
 		 System.out.println(singleLetter);
	}

	private static void removeSpacesInString() {
		String name ="Ravi varma akula";
 		String joins = name
 		.chars()
 		.filter(c-> c!=' ')
 		.mapToObj(c-> String.valueOf((char) c))
		.collect(Collectors.joining("-"));
 		System.out.println(joins);
	}

	private static void listNames() {
		List<String> names = Arrays.asList("avika","Sushmitha","Anshitha","Priya");
 		 String listNames = names
 		 .stream()
 		 .reduce(" ",(a,b)-> a + " "+b);
 		 System.out.println(listNames);
	}

	private static void largelistToList() {
		List<List<String>> words = new ArrayList<List<String>>();
 		 words.add(Arrays.asList("Hi", "bye"));
 		 words.add(Arrays.asList("thinnava","padukunnava"));
 		 words.add(Arrays.asList("Bye", "Good bye"));
 		 System.out.println(words);
	}

	 // Remove duplicate characters from String
	private static void removeDuplicates() {
		String name = "Ravivarma";
 		 
 		 String removeDup = name
 		 .chars()
 		 .distinct()
 		 .mapToObj(c-> String.valueOf((char) c))
		 .collect(Collectors.joining());
 		 System.out.println(removeDup);
	}


	private static void reduceHighestValues(List<Integer> nums) {
		Integer highest = nums
 		 .stream()
 		 .reduce(Integer.MIN_VALUE, (a,b)-> a > b ? a: b);
 		 
 		System.out.println(highest);
	}
	
		
//		0 , 1+0,
//		1 , 2+3
//		5 ,5+5
//		 sum

	private static void compare(List<Integer> nums) {
		Integer compare = nums
 		.stream()
 		.reduce(0,(a,b)->(a+b));
 		System.out.println(compare);
	}

	private static void evenOdd(List<Integer> nums) {
		Map<Boolean, List<Integer>> evenOdd = nums
 		.stream()
 		.collect(Collectors.partitioningBy(n-> n%2 ==0));
 		System.out.println(evenOdd);
	}

	private static void anymatch(List<Integer> nums) {
		boolean anyMatch = nums
 		.stream()
 		.anyMatch(n -> n%3 == 0);
 		System.out.println(anyMatch);
	}

	private static void allmatch(List<Integer> nums) {
		boolean allMatch = nums
 		.stream()
 		.allMatch( n-> n % 5==0);
 		System.out.println(allMatch);
	}

	private static void parallelStream(List<Integer> nums) {
		// Parallel Stream
 		 nums
 		 .parallelStream()
 		 .forEach(n -> System.out.println(n));
	}

	private static void flatMap(List<List<String>> words) {
		System.out.println(words); 
 		List<String> list2 = words
 		.stream()
 		.flatMap(entry -> entry.stream())
 		.toList();
 		System.out.println(list2);
	}

	private static void maxInt(List<Integer> nums) {
		int maxInt = nums
 		 .stream()
 		 .mapToInt(n ->n)
 		 .max()
 		 .getAsInt();
 		 System.out.println(maxInt);
	}

	private static void sumOfValues(List<Integer> nums) {
		int sum1 = nums
 		 .stream()
 		 .mapToInt(n->n)
 		 .sum();
 		 System.out.println(sum1);
	}

	private static void marksGreaterThan(Map<String, Integer> students) {
		List<Entry<String, Integer>> list = students
 		 		 .entrySet()
 		 		 .stream()
 		 		 .filter(entry -> entry.getValue()>95)
 		 		 .toList();
 		 System.out.println(list);
	}

	private static void maxvalue(List<Integer> nums) {
		Integer maxValue = nums
			.stream()
			.sorted(Comparator.reverseOrder())
			.findFirst()
			.get();
			System.out.println(maxValue);
	}

	private static void empDetails(List<Employee> employees) {
		List<Employee> sortedemp = employees	
 		 .stream()
 		 .sorted((emp1,emp2)->emp1.getEmpName().compareTo(emp2.getEmpName()))
 		 .toList();
 		 System.out.println(sortedemp);
	}

	private static void sorted(List<Integer> nums) {
		System.out.println(nums);
		 		 List<Integer> sortedLlist = nums 
		 			.stream()
		 			.sorted()
		 			.collect(Collectors.toList());
		 		 System.out.println(sortedLlist);
	}

	// salary > 15000
	private static void employee(List<Employee> employees) {
		List<Employee> latemp = employees
 		 		.stream()
 		 		.filter(e ->e.getEmpName().length()>2)
 		 		.filter(e-> e.getSalary() >15000)
 		 		.toList();
 		  System.out.println(latemp);
	}
	
}
