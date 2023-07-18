package com.demo;

public class CountNumberOfOccurrence {
	
	static int countOcuurence(int arr[],int n,int x)
	{
		int res=0;
		for(int i=0;i<n;i++)
		{
			if(x==arr[i])
				res++;
		}
		return res;
	}
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,2,2,3,3,4,5,6,7};
		int n = arr.length;
		int x=2;
		int countOcuurence = countOcuurence(arr, n, x);
		System.out.println(countOcuurence);
		

	}

}
