package com.vaishnavi;
import java.util.*;
public class CheckNum {

	public static void main(String[] args) {

		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number");
		int input = sc.nextInt();
		
		if(input>0)
		{
			System.out.println("enter number is positive");
			
		}
		else if(input<0)
		{
			System.out.println("enter number is negative");
		}
		else
		{
			System.out.println("the number is zero");
		}
		 
	 
	}

}
