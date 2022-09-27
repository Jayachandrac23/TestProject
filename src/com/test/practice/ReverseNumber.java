package com.test.practice;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Reverse Started ");
		int n=536;
		int Rem=0;
		int Reverse=0;
		while (n>0)
		{
			Rem=n%10;
			Reverse=Reverse*10+Rem;
			n=n/10;
		}
       System.out.println(Reverse);
	}

}
