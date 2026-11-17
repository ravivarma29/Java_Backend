package com.runnable;

public class TestThread {
	public static void main(String[] args) throws InterruptedException {
		Counter counterObj = new Counter();


		Thread1 t1=new Thread1(counterObj);
		t1.start();
		Thread3 t2 = new Thread3(counterObj);
		t2.start();
		System.out.println("Hii");
		t1.join();
		t2.join();
		System.out.println("End ");
		//100
		System.out.println("Conter value " +counterObj.count);
		System.out.println("end of the program");
	}
}
	   class Thread1 extends Thread{
		Counter counter;
		
		Thread1(Counter c)
		{
			this.counter=c;
		}
		
		@Override
		public void run() {
			for(int i=0;i<100;i++)
			{
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Thread1 "+i);
				counter.increment();
			}
		}
		}
		
		class Thread3 extends Thread{
			Counter counter;
			
			Thread3(Counter c)
			{
				this.counter=c;
			}
			
			@Override
			public void run() {
				for(int i=0;i<100;i++)
				{
					try {
						Thread.sleep(1);
					} catch (InterruptedException e) { 	
						e.printStackTrace();
					}
					System.out.println("Thread2 "+i);
					counter.increment();
				}
			}

	   }
	