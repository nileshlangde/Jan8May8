package test;

public class Array {
	
	public static void main(String[]args) {
		String i= "mom"; 
		 	int len=i.length();
		 	String j="";

		for (int z=len-1;z>=0;z--) 			
			
		{
		    j=j+i.charAt(z);
		}
		if(j.equals(i)) 
		{
		System.out.println("it it a pallendrom number");
	    }
		else {
			System.out.println("it it not a pallendrom number");
		}
	}
}