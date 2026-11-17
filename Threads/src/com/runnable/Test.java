package com.runnable;

public class Test {
	public static void main(String[] args) {
		Runnable Thread2= new Thread2();
			
		Thread t = new Thread(Thread2);
		Test t2 = new Test();
		
		t.start();
		t2.print();
	}
	
	void print()
	{
		Thread.currentThread().getName();
		for(int i=0 ;i<=10;i++)
		{
		System.out.println("Main");
		}
	}

}
