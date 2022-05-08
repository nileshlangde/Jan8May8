package assinment;

public class Diamond {
	public static void main(String[]args) {
		
		for(int a=1;a<=5;a++)
		   {
			for(int b=5;b>=a;b--) 
			{
				System.out.print("  ");
			}
			for(int c=1;c<=a;c++) 
			{
				System.out.print("   *");
			}
			System.out.println();
		   }
	
		for(int d=4;d>=1;d--)
		{
			for(int e=5;e>=d;e--)
			{
				System.out.print("  ");			
		    }
			for(int f=1;f<=d;f++) 
			{		
				System.out.print("   *");
			}
			System.out.println();
		}		
		
	}
}
		
		
	

