package com.test.practice;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Citiustech";
		String Reverse="";
		for(int i=str.length()-1;i>=0;i--)
		{
			Reverse=Reverse+str.charAt(i);
		}
		System.out.println("Reverse is :"+Reverse);
	}

}
