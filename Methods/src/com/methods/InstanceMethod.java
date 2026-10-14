package com.methods;

public class InstanceMethod {
	public static void main(String[] args) {
		System.out.println("Hii");
		InstanceMethod m=new InstanceMethod();
		m.add();
		int res=m.sumOfTwoNumbers();
		System.out.println(res/10);
		System.out.println(res);
		int res1=m.sumOfTwoNumbers();
		System.out.println(res1+50);
		System.out.println("Exit");
	}
  void add() //Method Declaration
  {
	  int a=10;
	  int b=20;
	  System.out.println(a+b);
  }
  int sumOfTwoNumbers()
  {
	  int q=20;
	  int w=30;
	  int res=q+w;
	  //System.out.println(res);
	  return res; // after return we should not print value , it won't execute
	
  }
}
