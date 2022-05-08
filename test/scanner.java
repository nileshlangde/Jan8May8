package test;

import java.util.Scanner;

public class scanner {
	public static void main (String[]args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("enter the amount");
		int rupee=obj.nextInt();
		
		if (rupee%100==0)
		{
			System.out.println("please enter the pin"); 

         }
		else {
			    System.out.println("enter valid amount");
		     }
		}
		
		
	}


