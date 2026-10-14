package com.Marks;

import java.util.Scanner;

public class TaskMarks {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks");
		int marks=sc.nextInt();
		//System.out.println("enter the marks" + marks);
		//90-100 =grade A
		//80- 90 = gd B
		//70 -80 =gd c
		//50-70 = gd d
		//0-50 = fail
		//-10 = Invalid marks
		if(marks>=90 && marks <=100)
		{
			System.out.println(marks + " Grade A");
		}
			else if(marks>=80 && marks<90)
			{
				System.out.println(marks + " Grade B");
			}
				else if(marks>=70 && marks<80)
				{
					System.out.println(marks + " Grade C");
				}
					else if(marks>=50 && marks<70)
					{
						System.out.println(marks + " Grade D");
					}
	
						else if(marks>=0 && marks<50)
						{
							System.out.println(marks + " Fail");
						}
					
			else
			{
				System.out.println("Invalid marks");
			}
			
}

}
