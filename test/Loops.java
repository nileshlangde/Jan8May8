package test;

public class Loops {

	
	public void addition() {
		for(int a = 1;a<=5;a++)//1,2,3,4,5,6
		{
			for(int b = 5;b>=a;b--)//1,2,3,4,5
			{
				System.out.print(" * ");
			}
			System.out.println();
	    }
	}	
		public static void substraction() {
		for(int a = 1;a<=5;a++)//1,2,3,4,5,6
		{
			for(int b = 1;b<=a;b++)//1,2,3,4,5
			{
				System.out.print(" * ");
			}
			System.out.println();
	    }
		}
		public static void main(String[]args)	{
		
		Loops AB=new Loops();
		AB.addition();
		Loops.substraction();
		
		
		}		
		
}
