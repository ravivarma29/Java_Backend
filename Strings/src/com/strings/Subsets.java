package com.strings;

public class Subsets {
	public static void main(String[] args) {
		String input="abcd";
		for(int i=0;i<=3;i++){ // <=3  Index Value
		for(int j=i;j<=3;j++) {
				String temp=input.substring(i,j+1);
				System.out.println(temp);
			}
		}
	}

}
