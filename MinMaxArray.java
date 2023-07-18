package com.demo;

public class MinMaxArray {
	
	public static int getMin(int arr[],int n)
	{
		int res=arr[0];
		for(int i=1;i< n;i++)
		{
			res=Math.min(res, arr[i]);
		}
		
		return res;
	}
	
	public static int getMax(int arr[],int n)
	{
		int res=arr[0];
		
		for(int i=1;i<n;i++)
		{
			res=Math.max(res, arr[i]);
		}
		return res;
	}
	
	public static void main(String[] args) {
		int arr[]= {12,1234,45,67,1};
		int n = arr.length;
		int min = getMin(arr, n);
		System.out.println("minimum array="+min);
		
		int max = getMax(arr, n);
		System.out.println("maximum array="+max);
		
	}

}
