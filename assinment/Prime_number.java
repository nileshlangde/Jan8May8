
package assinment;

import java.util.Scanner;

public class Prime_number {
	public static void main(String[]args) {
		
		Scanner scan =new Scanner(System.in);
		System.out.println("please enter number");
		int a =scan.nextInt();
		
		int b= 0;
		for (int i=2;i<=a-1;i++)
		{
			if(a%i==0)
			{
				b=b+1;
			}
		}
			if (b>0) 
			{
				System.out.println("it is not a prime number");
			}
			else
			{ 
				System.out.println("it is  a prime number");
			}
			
			
			
			}
		
		
		
		
		
	}


