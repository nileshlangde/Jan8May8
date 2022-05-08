package Constructor;

public class Mainclass {
int u;
int v;
	int a = 10;//non-static variable
	int b = 20;//non-static variable
	static int m = 20;//static variable
	static int n = 20;//static variable
	static double c = 12.13;//static variable
	
	public void m1() {//no need of return statement,as void doesn't return anything
		int c=a+b;
		System.out.println(c);
	}
	public int m2() {
		int c=a+b;
		System.out.println(c);
		return c;//return statement is mandatory if return type of method is not void.
	}
	public static int m3() {// if static keyword is present in method declaration it is called static method
		int d=m+n; //we can only use static variables in static method
		System.out.println(d);
		return d;//return statement is mandatory if return type of method is not void.
	}
	public static void m4() {
		double d=c; //we can't use non-static variables in static method
		System.out.println(d);
		
	}
	Mainclass()
	{
		u= 50;
		v=60;
		
	}
	
	public static void main(String[]args)	
	{
		Mainclass AC=new Mainclass();
		Mainclass BC=new Mainclass();
		 AC.m1();
		 AC.m2();
		 Mainclass.m3();
		 Mainclass.m4();
		 System.out.println(BC.u);
	
	}	
	
}
