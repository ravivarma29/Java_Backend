package com;

public class LargestSmallest {
public static void main(String[] args) {
	int [] arr= {21,6,71,37,93,87};
	int max=arr[0];
	int min=arr[0];
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>max) 
		{
			max=arr[i];
			//System.out.println("If loop "+max);
		}
		if(arr[i]<min)
		{
			min=arr[i];
			//System.out.println(min);
		}
	}
	System.out.println("Max Value " +max);
	System.out.println("Min Value "+min);
}
}
