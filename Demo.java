package com.demo;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Demo {
	
	public static int findsecondlargest(int[] arr) {
		int largest=Integer.MIN_VALUE;
		int secondLargest= Integer.MIN_VALUE;
		
		for(int i=0;i< arr.length;i++)
		{
			if(arr[i] > largest) {
				secondLargest=largest;
				largest=arr[i];
			}else if(arr[i]>secondLargest && arr[i] != largest) {
				secondLargest=arr[i];
			}
		}
		return secondLargest;
	}

	public static void main(String[] args) {
		
		
		int[] array= {23,56,78,23,90,32};
		 int findsecondlargest = findsecondlargest(array);
		 System.out.println(findsecondlargest);
		
		// TODO Auto-generated method stub
//		
//		String str1 = "abcdABCDabcd";
////		  {a=2, A=1, b=2, B=1, c=2, C=1, d=2, D=1}
////		  {a=3, b=3, c=3, d=3}
//		
//		String lowerCase = str1.toLowerCase();
//		String[] split2 = lowerCase.split("");
//		String[] split = str1.split("");
//		
//		Map<String,Long> collect = Arrays.stream(split).collect(Collectors.groupingBy(e->e,Collectors.counting()));
//		System.out.println(collect);
//		
//		Map<String, Long> collect2 = Arrays.stream(split2).collect(Collectors.groupingBy(f->f,Collectors.counting()));
//                System.out.println(collect2);
//	}
		
	
//		Find out the second largest element from an array
//		ex... 23, 56, 78, 23, 90. 32
//		time complexity--O(n)
//		Ans--78
		
		
		
	}

}
