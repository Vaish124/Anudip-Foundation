package com.vaishnavi;
import java.util.*;
public class Weekdays {

	public static void main(String[] args) {
		Scanner d= new Scanner (System.in);
		System.out.println("Enetr the integer between 1-7");
		int day=d.nextInt();
		
	switch (day)
		{
			case 1: 
				{
					System.out.println("Monday");
				}
			break;
			
			case 2:
			{
				System.out.println("tuesday");
			}
		break;
		  
			case 3:
			{
				System.out.println("wednesday");
			}
		break;
			case 4:
			{
				System.out.println("thursday");
			}
		break;
			case 5:
			{
				System.out.println("friday");
			}
		break;
			case 6:
			{
				System.out.println("saturday");
			}
		break;
			case 7:
			{
				System.out.println("Sunday");
			}
		break;
		default :
		{
		
			System.out.println("Day input is invalid");
		}
	
			
		}
		


	}

}
