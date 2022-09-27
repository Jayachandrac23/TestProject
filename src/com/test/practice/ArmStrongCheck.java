package com.test.practice;

public class ArmStrongCheck {
//test
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int n=153;
		 
		 isarmStrong(n);
		
	}
	
	public static void isarmStrong(int n)
	{
		int temp=n;
		int rem=0;
		int arm=0;
		while(n>0)
		{
			rem=n%10;
			arm=arm+(rem*rem*rem);
			n=n/10;
		}
		System.out.println(arm);
		if(temp==arm)
			System.out.println("is armStrong ");
		else 
			System.out.println("not armStrong");
	}

}
