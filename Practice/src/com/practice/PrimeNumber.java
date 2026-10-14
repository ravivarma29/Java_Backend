package com.practice;

import java.util.Scanner;

// It is taking for Milliseconds

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		PrimeNumber p = new PrimeNumber();
		p.checkIsPrime(num);
		p.checkIsPrime2(num);
		p.checkIsPrime3(num);
		p.checkIsPrime4(num);
		p.checkIsPrime5(num);
		p.checkIsPrime6(num);

		// num =dynamic value
		// i , iteration
	}

	void checkIsPrime(int num) {
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("Case 1: " + num + " is a Prime Number");
		} else {
			System.out.println("Case 1: " + num + " is not a Prime Number");
		}
	}

	void checkIsPrime2(int num) {
		int count = 0;
		for (int i = 2; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 1) // eliminated 1 here, for loop started from 2
		{
			System.out.println("Case 2: " + num + " is a Prime Number");
		} else {
			System.out.println("Case 2: " + num + " is not a Prime Number");
		}

	}

	void checkIsPrime3(int num) {
		int count = 0;
		for (int i = 2; i <= num-1; i++) {
			if (num % i == 0)
				;
			count++;
		}
		if (count == 0) {
			System.out.println("Case 3:" + num + " is a Prime Number");
		} else
			System.out.println("Case 3:" + num + " is  not a Prime Number");
	}

	void checkIsPrime4(int num) {
		int count = 0;
		// System.out.println("case 4");
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0)
				count++;
		}
		if (count == 0) {
			System.out.println("Case 4: " + num + " is a Prime Number");
		} else
			System.out.println("Case 4: " + num + " is  not a Prime Number");
	}

	void checkIsPrime5(int num) {
		int count = 0;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				count++;
			}
		}
			if (count == 0) {
				System.out.println("Case 5: " + num + " is a Prime Number");
			} else
				System.out.println("Case 5: " + num + " is  not a Prime Number");

	}
	void checkIsPrime6(int num)
	{
	int count = 0;
	long start=System.currentTimeMillis();
	for (int i = 2; i <= Math.sqrt(num); i++) {
		if (num % i == 0) {
			count++;
			break;
		}
	}
	long end= System.currentTimeMillis();
		if (count == 0) {
			System.out.println("Case 5: " + num + " is a Prime Number");
		}
		else {
			System.out.println("Case 5: " + num + " is  not a Prime Number");
		}
		System.out.println("Time Taken : " + (end-start));
	}
}

