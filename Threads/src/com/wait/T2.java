package com.wait;

public class T2 extends Thread {
	
	Object obj;
	T2(Object obj)
	{
	this.obj=obj;	
	}
	
 @Override
public void run() {
	 synchronized(obj)
	 {
		 //e.printStackTrace(e);
		 System.out.println("T2 Thread Running");
		 System.out.println("T2 Thread is Notifying ALL");
		 try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		 obj.notifyAll();
	 }
	 
}
}
