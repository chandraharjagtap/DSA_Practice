package com.demo;

public class FindMissingNumberInArray {

	public static void findMissing(int arr[],int n)
	{
//		int i;
//		int temp[]=new int[n+1];
//		for(i=0;i<=n;i++)
//		{
//			temp[i]=0;
//		}
//		
//		for(i=0;i< n;i++)
//		{
//			temp[arr[i]-1]=1;
//		}
//		
//		int ans=0;
//		for(i=0;i<=n;i++)
//		{
//			if(temp[i]==0)
//				ans=i+1;
//		}
//		System.out.println(ans);
		
		int sum=((n+1)*(n+2))/2;
		for(int i=0;i<n;i++)
		{
			sum-=arr[i];
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,5,2,3,6,7};
		int n = arr.length;
		findMissing(arr, n);

	}

}
