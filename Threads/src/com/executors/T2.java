package com.executors;

public class T2 extends Thread {
	
	@Override
	public void run() {
		for(int i=0;i<=5;i++)
		{
			System.out.println("T2 Thread");
		}
	}
}
