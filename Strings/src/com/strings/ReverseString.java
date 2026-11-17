package com.strings;

public class ReverseString {
	public static void main(String[] args) {
		ReverseString rs=new ReverseString();
			String res=rs.reverseString("Ravivarma");
			System.out.println(res);
		
	}
	String  reverseString(String input) {
		//
		String res="";
		for(int i=input.length()-1;i>=0;i--)
		{
			char temp=input.charAt(i);
			 res=res+temp;	
		}
		return res;
	}

}
