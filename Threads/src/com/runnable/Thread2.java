package com.runnable;

public class Thread2 implements Runnable{

	@Override
	public void run() {
		Thread.currentThread().getName();
		for (int i=0;i<=10;i++)
				{
				System.out.println("Thread3");
				}
		
	}

}
