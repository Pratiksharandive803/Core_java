package com.runtime;

public class DemoRTE {

	public static void main(String[] args) {
		
		
	//example for unchekced or runtime exception	
      int len=args.length;//get the length of command line 
      try {
      int div=10/len;
      System.out.println("division of number"+div);
      }
      catch(ArithmeticException ae) {
    	  System.out.println("cannot divide by zero");
      }
      try {
      System.out.println("array values:"+" "+args[0]+" "+ args[1]);
      System.out.println("all good");
      }catch(ArrayIndexOutOfBoundsException ai) {
    	  ai.printStackTrace();
      }
      try {
      A a=null;
      a.disp();
      }catch(NullPointerException npe) {
    	  System.out.println("mem allocation is necessary");
      }
      
      try {
      String s="java";
      int b=Integer.parseInt(s);
      }catch(NumberFormatException nfe) {
    	  System.out.println("cannot convert a string object containing chars into number");
      }
      finally {
      System.out.println("end of the program");
      }
     
	}

}
class A{
	void disp() {
		System.out.println("welcome");
	}
}
