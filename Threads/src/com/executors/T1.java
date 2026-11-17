package com.executors;

public class T1 extends Thread{
	
	@Override
	public void run() {
		for(int i=0;i<=5;i++)
		{
			System.out.println("T1 Thread");
		}
	}

}
