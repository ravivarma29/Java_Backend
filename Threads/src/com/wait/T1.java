package com.wait;

public class T1 extends Thread{

	Object obj;
	
	T1(Object obj){
		this.obj=obj;
	}
	@Override
	public void run() {
		synchronized(obj) {
			System.out.println("T1 Thread is started");
			try {
				obj.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("T1 Thread Resumed");
		}
	}
}
