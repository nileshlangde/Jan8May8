package assinment;

public class four_triangles {
	
	public static void main(String[]args) {
		
		for(int a=1;a<=6;a++) {
			for(int b=6;b>=a;b--) 
			{
				System.out.print("  ");
			}
			for(int c=1;c<=a;c++)
			{
				System.out.print(" *");
			}
					
			for(int d=1;d<=4;d++) 
			{
				System.out.print(" ");
			}
			
			for(int e=1;e<=a;e++) 
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	
		System.out.println();
		
	
	for (int i=1;i<=6;i++) {
		for (int j=1;j<=i;j++) 
		{
			System.out.print("  ");
		}
		
		for (int k=6;k>=i;k--) 
		{
			System.out.print(" *");
		}
		
		for(int m=1;m<=4;m++) 
		{
			System.out.print(" ");
		}
		
		for(int n=6;n>=i;n--) 
		{
			System.out.print(" *");
		}
	
		System.out.println();
	}
	
	
	
	}

}
