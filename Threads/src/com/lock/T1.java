  package com.lock;

public class T1 extends Thread{
	T2 t2;
	@Override public void run()
	{
		try {
			t2.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		} 
		for(int i=0;i<10;i++)
		{
		System.out.println("Thread1 "+ i);
	}
	}

}
