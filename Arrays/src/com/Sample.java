package com;

public class Sample {
	public static void main(String[] args) {
		
		//Largest number
		
//		int arr[] = { 2, 45, 73, 23, 56, 93 };
//		int max = arr[0];
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] > max) {
//				max = arr[i];
//			}
//		}
//		System.out.println(max);
		
		//Smallest Number
//		int arr[]= {2,78,34,67,12,54,67};
//		int min=arr[0];
//		for(int i=0;i<arr.length;i++)
//		{
//			if(arr[i]<min)
//			{
//				min=arr[i];
//				
//			}
//		}
//		System.out.println("Minimum value is  "+min);
		
		//reverse array;
		//{12,25,16,17,20}
		int arr[]={12,25,16,17,20};
		reverseArray(arr);
	}
	static void reverseArray(int[] arr)
	{
		int[] newArr=new int[arr.length];
		int j=0;
		//{12,25,16,17,20}
		// 0 , 1, 2, 3 ,4
		for(int i=arr.length-1;i>0;i--)
		{
			int temp=arr[i];
			newArr[j]=temp;
			j++;
			
		}

	}
 
}
