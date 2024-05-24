package com.vaishnavi;
import java.util.*;

class A
{
	public int m1(int number)
	{
		int fact=1;
		int i=1;
		
		while(i<=number)
		{
			fact=fact*i;
			i++;
		}
		
		return fact;
	}
}

public class Factorial {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the positive number to find the factorial:-");
		int num=sc.nextInt();
		A a=new A();
	    System.out.println("the factorial is :-"+a.m1(num));
		
		

	}

}
