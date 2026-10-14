package com.blocks;

public class Blocks extends BlocksParent{

	public static void main(String[] args) {
		System.out.println("main method " +"Hii");
		Blocks b= new Blocks();
		
	}
	Blocks()
	{
		System.out.println("From constructor");
	}
	static {
		 System.out.println("static block");
	 }
	{
		System.out.println("Instace block");
	}
}
 