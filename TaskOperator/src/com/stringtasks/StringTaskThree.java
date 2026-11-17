package com.stringtasks;

public class StringTaskThree {
	public static void main(String[] args) {
		/*
		 * Given a string count how many subsets can be formed with length as 2, print
		 * all such subsets and finally print count as well( substring is not useful
		 * here) Input : abcd
		 *  Output : 
		 *  ab , ac ,ad ,bc ,  bd ,  cd 
		 *      Count : 6
		 */
		int count=0;
		String input="abcd";	
		for(int i=0;i<input.length();i++)
		{
			for(int j=i+1;j<input.length();j++)
			{
				System.out.print(" " + input.charAt(i)+input.charAt(j)+ " ");
				count++;
			}		
				
		}
		System.out.println(" ");
		System.out.println(count);
	}
	

}

