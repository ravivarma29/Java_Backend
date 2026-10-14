package com.streams; 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamFunctions {

	public static void main(String[] args) {
//		firstLetter();
//		nameList(); 
//		withoutSpaceName();			
//		removeDuplicates();
//		seperateCommas();
//		alphabet();
//		digit();
		
//		Programming
//		characterFrequency
//		GroupingBy
//		freqCharacters();
//		freSentence();
//		deptName(students);
//		deptNumbers(students);
//		studentDepartment(students);	
		
		List<Student> students = new ArrayList<Student>();
		Department dept1 = new Department("CSE");
		Department dept2 = new Department("MECH");
		Department dept3 = new Department("EEE");
		
		Student s1 = new Student(1, "Ravi" , dept1 , 96 );
		Student s2 = new Student(2, "Anshu" , dept2 , 98);
		Student s3 = new Student(3, "Kiran" , dept3 , 94);
		Student s4 = new Student(4, "Priya" , dept1  ,100);
		Student s5 = new Student(5, "venu" , dept2 , 96);
		Student s6 = new Student(6, "sai" , dept1 ,92);
		
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		students.add(s6);
//		System.out.println(students);
		 
		Map<String, Double> averageMarks = students
				.stream()
				.collect(Collectors.groupingBy(
				student ->student.getDepartment().department,
				Collectors.averagingDouble(student->student.marks)));
		System.out.println(averageMarks);
		
				
		
		System.out.println(" ");
		
		students //seperated with Branch name
				.stream()
				.collect(Collectors.groupingBy(
						student -> student.getDepartment().department))
				.entrySet()
				.forEach(e-> System.out.println(e.getKey()  + "  " + e.getValue() ));
				 
		
		
	}

	private static void studentDepartment(List<Student> students) {
		Map<String, Long> numOfStudents = students 
				.stream()
				.filter(st->  st.getDepartment().department.equals("CSE"))
				.collect (Collectors.groupingBy(
						student -> student.getDepartment().department
						,Collectors.counting()));
					System.out.println("Particular Department." + numOfStudents);
	}

	private static void deptNumbers(List<Student> students) {
		Map<String, Long> numOfStudents = students 
				.stream()
				.collect (Collectors.groupingBy(
						student -> student.getDepartment().department
						,Collectors.counting()));
					System.out.println("dept No." + numOfStudents);
	}

	private static void deptName(List<Student> students) {
		//particular Dept
		Map<String, List<Student>> Depart = students 
				.stream()
				.collect(Collectors.groupingBy(
				student -> student.getDepartment().department));
				System.out.println(Depart);
	}

	private static void freSentence() {
		String sentence = "Java Developer Java";
								Map<String, Long> freqSentence = Arrays.stream(sentence.split(" "))
								.collect(Collectors.groupingBy(
								word -> word,
								Collectors.counting()
								));
								System.out.println(freqSentence);
	}

	private static void freqCharacters() {
		String name = "Programming";
		Map<Object, Long> frequencyCharacters = name 
		    .chars()
		    .mapToObj(c-> (char) c)
		    .collect(Collectors.groupingBy( c -> c ,
		    		Collectors.counting()));
		System.out.println(frequencyCharacters);
	}
	
	private static void digit() {
		String input ="A1B2C%";
		String isAlphabet = input
			.chars()
			.filter(c ->Character.isDigit(c))
			.mapToObj(c ->String.valueOf((char) c))
			.collect(Collectors.joining());
		System.out.println(isAlphabet);
	}

	private static void alphabet() {
		String input ="A1B2C%";
		String isAlphabet = input
			.chars()
			.filter(c ->Character.isAlphabetic(c))
			.mapToObj(c ->String.valueOf((char) c))
			.collect(Collectors.joining());
		System.out.println(isAlphabet);
	}

	private static void seperateCommas() {
		// seperated with commas / -
		String name2 = 	"RAVIVARMA";
		String result2 = name2
								.chars()
								.mapToObj(c -> String.valueOf((char) c))
								.collect(Collectors.joining("-"));
		System.out.println(result2);
	}

	private static void removeDuplicates() {
		//Remove duplicates from string  
		
		String name ="RAVIVARMA";
		
		String result = name 
		 	 .chars() // int Stream
		 	 .distinct()
		 	 .mapToObj(c -> String.valueOf((char) c))
		 	 .collect(Collectors.joining());
		System.out.println(result);
	}

	private static void withoutSpaceName() {
		//remove spacing	
		String  name3 ="Akula Ravi Varma";
					String result3 = name3
		     							.chars()
		     							.filter(c-> c!=' ')
		     							.mapToObj(c-> String.valueOf((char) c))
										.collect(Collectors.joining());
										
								System.out.println(result3);
	}

	private static void nameList() {
		// name will be in brackets
		String  name4 ="RAVIVARMA";
		String result4 = name4
 							.chars()
// 							.filter(c-> c!=' ')
 							.mapToObj(c-> String.valueOf((char) c))
							.collect(Collectors.joining(" ,","[","]"));
					System.out.println(result4);
	}

	private static void firstLetter() {
		String sentence = "I Am A Java Developer Who Is Poor In Java";
		 String[] words = sentence.split(" ");
		 String result5 = Arrays
		 		.stream(words)
		 		.map(word -> String.valueOf(word.charAt(0)))
				.collect(Collectors.joining());
		 System.out.println("firstWord " + result5);
	}

	}
