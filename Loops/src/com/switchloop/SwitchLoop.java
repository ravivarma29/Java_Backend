package com.switchloop;

import java.util.Scanner;

public class SwitchLoop {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the Floor");
		int floor=sc.nextInt();
		switch(floor) {
		case 1:
			System.out.println("Frst Floor");
			break;
		case 2:	
			System.out.println("Frst Floor");
			break;
		case 3:
			System.out.println("Frst Floor");
			break;
		case 4:
			System.out.println("Frst Floor");
			break;
		case 5:
			System.out.println("Frst Floor");
			break;
		default:
			System.out.println("Invalid Floor");
		}
		sc.nextLine(); // whenever we use int before string use this statement to print in Next Line
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the Item");
		String item = sc.nextLine();
		switch(item) {
		case "VEG" :
			System.out.println("Paneer Biryani");
			break;
		case "NON-VEG":	
			System.out.println("Mutton Biryani	");
			break;
		case "STARTER":
			System.out.println("CHicken 65");
			break;
		case "WAFFLES":
			System.out.println("Nutella Waffle");
			break;
		case "PIZZA":
			System.out.println("Chicken Pizza");
			break;
		default:
			System.out.println("Invalid Itemr");
		}
	}

}
