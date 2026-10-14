package com.whiledowhile;

public class WhileTask {
	public static void main(String[] args) {
		int i=5;
		//Entry Controlled Loop
		while(i>=6)
		{
			System.out.println(i + " times");
			i--;
		}
		i=9;
		//Exit controlled Loop
		do {
			System.out.println(i);
			i--;
		}
		while(i>=6);
	
	}

}
