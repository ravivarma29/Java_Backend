package com.lamda;

public class Test {
	public static void main(String[] args) {
		
		//Lamda
		//() -> {};
//		 Calculator calc =(a,b)->System.out.println(a+b);
//		 calc.sum(10, 30);
	 Calculator calc =(a,b)->{ 
			 System.out.println("Hii");
			 for(int i=0;i<10;i++)
			 {
				 System.out.println(i);
			 } 
			 return a+b;
			 };
			int val = calc.sum(50,20);
			System.out.println(val);
		
			calc.subtract( 20, 5);
			
			
			// Functional Interface 
			Runnable runnable = () ->{ System.out.println("From Thread...");};
			Thread t1= new Thread(runnable);
			t1.start();
			
	}
	
	
	

}
