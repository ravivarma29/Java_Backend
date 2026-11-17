package com.strings;

public class MethodsInString {
	public static void main(String[] args) {
		//Index value
		//		   01234
		String s1="Priya";
		//         01234567
		String s2="Anshitha";
		System.out.println(s1 +" " +s1.length());
		System.out.println(s2.length());
		System.out.println(s2.charAt(4));
		System.out.println("Contains"+ " " + s1.contains(s2));
		System.out.println(s1.indexOf('i'));
		System.out.println(s1.startsWith("FLL"));
		System.out.println(s1.endsWith(s2));
		System.out.println(s1.concat(s2));
		System.out.println(s1.compareTo(s2));
		System.out.println(s2.compareTo(s1));
		System.out.println(s1.replace('P', 'K'));
		System.out.println(s1);
		//substring
		String s3 = "Ravivarma";
		System.out.println(s3.substring(4,8));
		System.out.println(s3.substring(0,9));
		System.out.println(s3.substring(4));
		
		
		// EDUTECH  ---> HCETUDEs
		//cannot reverse string 
		
		
				
	}

}
