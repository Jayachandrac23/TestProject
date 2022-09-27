package com.test.practice;

public class Fibenosis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int first=0,second=1,next=0;;
		System.out.print(first+" "+second+" ");
		for(int i=2;i<=10;i++)
		{
			next=first+second;
			first=second;
			second=next;
			
			System.out.print(next+" ");
		}
		
	}

}
