package com.demo;

import java.util.Arrays;

public class OneSiteNegativearray {
	
	public static void main(String[] args) {
		
		int arr[]= {-4,2,4,-5,-8,6,2};
		
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(" "+arr[i]);
		}
	}

}
