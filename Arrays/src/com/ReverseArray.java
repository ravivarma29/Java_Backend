package com;

public class ReverseArray {
	// This Class reWatch onceagain to understand better
	//29/12/2025
	public static void main(String[] args) {
		int arr[]= {12,43,78,93,67};
		int[] revArray = reverse(arr);
		
		//Enhanced for loop or for each loop 
		/*
		 * for(int num:revArray) { System.out.println(num); }
		 */
		int []reverseArray=revArray2(arr);
		for(int number:reverseArray) {
			System.out.println(number);
		}
		
	}
	static int[] reverse(int[] arr)
	{
		int[] newArr=new int[arr.length];
		int j=0;
	//5, 5th
		// 10.78,4,56.21
		for(int i=arr.length-1;i>=0;i--) {
			int temp=arr[i];
			newArr[j]=temp;
			j++;	
		}
		return newArr;
	}
	static int[] revArray2(int[] arr)
	{
		int start=0;
		int end=arr.length-1;
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
			}
		return arr;
	}
}
