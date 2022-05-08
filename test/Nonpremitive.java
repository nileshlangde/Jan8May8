package test;

public class Nonpremitive {
	String a1="HELLO";
	String a2=new String("HELLO ALL");

	public static void main(String[]args){
		Nonpremitive AB=new Nonpremitive();
		System.out.println(AB.a2.length());
		System.out.println(AB.a1.equalsIgnoreCase("hello"));
		
	}	
	}
