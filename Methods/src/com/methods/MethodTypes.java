package com.methods;

public class MethodTypes {
	// static don't need object 
	//cannot print any value after return 
	//It will never execute the next line in method (return always exit from method)
	
	public static void main(String[] args) {
		MethodTypes s=new MethodTypes();
		s.sum();
		System.out.println("Completed");
		
	}
	void sum()
	
	{
		int a,b,res;
		a=10;b=20;res=30;	
		System.out.println(a);
		System.out.println(b);
		System.out.println(a+b);
		
		
	}

}
