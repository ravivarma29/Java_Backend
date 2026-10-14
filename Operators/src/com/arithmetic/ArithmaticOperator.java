package com.arithmetic;
public class ArithmaticOperator {
	public static void main(String[] args) {
		
	//	System.out.println(name);
		
		int n1=10;
		int n2=20;
		System.out.println(n1+n2);
		int n3=n1+n2+10;
		System.out.println(n3);
		
		//String Concatenation
		
		String s1 = "Ravi";
		String s2 = "Varma";
		System.out.println(s1+s2); // concatenation
		System.out.println(s1+"1"); // Ravi1
		System.out.println(s1+1); // Ravi+1 =Ravi1
		System.out.println(1+2+s1); // numbers addition + Ravi = 3Ravi
		System.out.println(1+"2"+s1);// int+string = string = 12Ravi
		System.out.println("1+2"+s1); // doesn't add bcoz inside string + s1 = 1=2Ravi
		System.out.println(1+12+3+"1"+s1+12+1);
		//13+3+"Ravi"+12+1
		//16+"Ravi"12+1
		//"16Ravi"+12+1
		//"16Ravi12"+1
		//161Ravi121
		
		float n4=2.0f;
		float n5=3.0f;
		int n6=4;
		System.out.println(n4+n5);
		System.out.println(n4+n6); // 2.0+4 =6.0 (int with float converts to float
		System.out.println(n2-n1); //20-10=10
		n1=5;
		n2=10;
		System.out.println("Division is : " + n2/n1); // 10/5 =2 (only quotient will get it)
		System.out.println("Modulo is : " +5%2);
		System.out.println(10/3);
		System.out.println(10%3);
		System.out.println(5.0/2.0); //divided  exactly
		System.out.println(10/3.0); // 3.3333
		System.out.println(11%3.0);  // 2.0
		//System.out.println(10/0);  //Excepton
	
		System.out.println("The value of 0/10 is "+0/10);
		System.out.println("The value of 0/10.0 is "+0/10.0);
		System.out.println("The value of 10.0/0.0 is "+ 10.0/0.0); // for floating value is Infinity
		System.out.println(10.0/0);
		System.out.println("The value is :" +10.0/2);
		
		// Relational Operators
		System.out.println("Relational Operators");
		int a=10;
		int b=20;
		int c=10;
		System.out.println(a==b);
		
		boolean check = a==b;
		System.out.println("the value of check is " +check);
		System.out.println(a>b);
		System.out.println(b>c);
		//not Operator (!)
		
		
		//Unary Operator
		System.out.println("Unary Operators");
		int num=15;
		int num5=20;
		System.out.println(+num);
		System.out.println(-num);
		System.out.println(+num5);
		System.out.println(-num5);
		
		boolean canVote=true;
		System.out.println(!canVote);
		System.out.println("Increment and Decrement");
		int q=10;
		q++;
		System.out.println(q);
		q--;
		System.out.println(q);
		++q;
		System.out.println(q);
		--q;
		System.out.println(q);
		
		//Pre and Post Increment
		 int w=15;
		 System.out.println("Decrements");
		 System.out.println(w++); //15
		 System.out.println(w); //16
		 System.out.println(--w); //15
		 System.out.println(w--); //15
		 System.out.println(w);  //14
		 
		 System.out.println("Value check");
		 int w1=5;
		 int w2=10;
		 int res  = w1++ + ++w2;
		 System.out.println(res); // 5++ + 10+1 => 5+11 =>16
		 System.out.println(w1);
		 res= w1++ + ++w1; //6++ + ++7=>6+8=>14
		 System.out.println(res);
		 w1=7;
		 System.out.println(w1);
		 System.out.println(++w1 + w1++ - --w1);//8 +7-7 => 8
 				 
		
	}

}
