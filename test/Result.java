package test;

public class Result {
	public static boolean pin ( String pinnumber) {
    if (pinnumber.equals("123456")) {
    		return true;
    		
      } else     {
    	         return false;
	            }
	}

        public static void entercash(int cash) {
        	if(cash%100==0) {
        		System.out.println("accept");
        	}else {
        		System.out.println("please enter valid amount");
        	}
        }

    

     public static void main(String [] args) {
    	 boolean pin=Result.pin("123456");
    	 
    	 if(pin==true) {
    		 Result.entercash(400);
    	 }else {
    		 System.out.println("u have entered rong pin");
    	 }
    		 
    	 
     }
 
}


