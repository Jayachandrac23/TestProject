package com.test.practice;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,4,1,6,78,90};
		
		
		int count=0;
		int arr2[]=new int[arr.length];
		
		for(int i=arr.length-1;i>=0;i--)
		{
			
			arr2[count]=arr[i];
			count=count+1;
		}

		for(int a:arr2)
		{
		System.out.println(a);
		}
	}

}
