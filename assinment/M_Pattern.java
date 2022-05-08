package assinment;

public class M_Pattern {
	public static void main(String[] args) 
	{
		for(int i=1; i<=3; i++)
		{
			for (int j=3; j>=i; j--)
			{
				System.out.print("* ");
			}
			
			if(i==1)
			{
				System.out.print("* *");
			}
			
			if (i>=2)
						
				for(int k=2; k<=i; k++)
				{
					System.out.print("  ");
				} 
				
			
			
			if(i==2)
			{
				System.out.print("* *");
			}
			
			
			
			
			
			if(i==3)
			{
				System.out.print("  *");
			}
				System.out.println();
		}
	}


}
