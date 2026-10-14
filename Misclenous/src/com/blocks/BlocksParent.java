package com.blocks;

public class BlocksParent {
	static
	{
		System.out.println("Parent static");
	}

	{
		System.out.println("Parent instance");
	}
	
	public BlocksParent()
	{
		System.out.println("Parent Constructor");
	}
}
