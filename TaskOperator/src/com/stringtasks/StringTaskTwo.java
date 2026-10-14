package com.stringtasks;

public class StringTaskTwo {
	public static void main(String[] args) {
		/*
		 * Given a string input print the output in toggled case starting with first
		 * character as upper case, second character as lower case and again third
		 * character as upper case etc..
		 * 
		 * Input : cucumber
		   Output : CuCuMbEr
		 */
		String input="Cucumber";
		input =input.toLowerCase();
		String res="";
		for(int i=0;i<input.length();i++)
		{
			char ch=input.charAt(i);
			if(i%2==0)
			{
			res=res+Character.toUpperCase(ch);
			}
			else
			{
			res=res+Character.toLowerCase(ch);
			}
		}
		System.out.println(res);
	}

}
