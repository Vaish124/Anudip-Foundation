package com.vaishnavi;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the no to check palindrome  ");
			int num=sc.nextInt();
			int result,sum=0,temp;
			
			temp=num;
			while(num>0)
			{
				result=num%10;
				sum=(sum*10)+result;
				num=num/10;
			}
			if(temp==sum)
			System.out.println("the number is palindrome");
			else
				System.out.println("the number is not a palindrome");
		

	}

}
