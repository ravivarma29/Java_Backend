package com.Twod;

public class TwoD {
	public static void main(String[] args) {
		int[][] arr=new int [3][3]; 
		arr[0][0]=13;
		arr[0][1]=12;
		arr[0][2]=45;
		
		arr[1][0]=43;
		arr[1][1]=63;
		arr[1][2]=36;
		
		arr[2][0]=75;
		arr[2][1]=64;
		//arr[2][2]=41;
		// we can't print all print statements
		//System.out.println(arr[2][1]);
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(" ");
			
		}
		
	}
	

}
