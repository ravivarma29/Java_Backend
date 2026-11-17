package com.stringtasks;

public class StringTaskFour {
public static void main(String[] args) {
	/*
	 * Find the largest digit in a number
	 *  Input : 361836 
	 *  Output : 8
	 */
    int num=361836;
    int max=0;
    while(num>0)
    {
    	int rem=num%10;
    	if(rem>max)
    	{
    		max=rem;
    		System.out.println("Max value " + max);
    	}
    	num=num/10;
    }
    System.out.println(max);
}
}
