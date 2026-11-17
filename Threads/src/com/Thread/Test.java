package com.Thread;

public class Test {
	public static void main(String[] args) {
		
//		System.out.println("----->" +Thread.currentThread().getName());
		MyThread myThread = new MyThread();
		
		MyThread myThread1 = new MyThread();
		MyThread2 myThread2 = new MyThread2();
		Test test = new Test();
		
		myThread1.start();
		myThread2.start();
		test.print();
	}
	
	public void print()
	{
		for(int i=1;i<=20;i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
//				e.printStackTrace();
				System.out.println(e);
			}
			System.out.println("Main");
		}
	}

}
