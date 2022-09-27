package com.test.practice;

public class phyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Test Phyramid");
		int count=1;
		for (int i=5;i>=0;i--)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=count;k++)
			{
				System.out.print("* ");
				
			}
			System.out.println();
			count=count+1;
		
		}
				
	}

}
