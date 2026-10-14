package com.stringtasks;

public class StringsTaskOne {
	public static void main(String[] args) {
		//string task
		// Count Number of Vowels and Number of consonants in a string.

		String input="RaviVarma";
		input=input.toLowerCase();
		System.out.println(input); // java
		int v=0;
		int c=0;
		for(int i=0;i<input.length();i++) {
			char ch=input.charAt(i);
			if(ch=='a'|| ch=='e' ||ch=='i'|| ch=='o'||ch=='u') 
			{
				v++;
			}
			else
			{
				c++;
			}
			
		}
		System.out.println("Vowels " +v);
		System.out.println("Consonants " +c);
	}

}
