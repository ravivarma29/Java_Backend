package com;

import java.util.Arrays;

public class SortArray{
	public static void main(String[] args) {
		int [] arr= {10,34,21,16,78,46};
		for(int i=0;i<arr.length-1;i++)
		{
			//0<6-1-0
			for(int j=0;j<(arr.length-1-i);j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
