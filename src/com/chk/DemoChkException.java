package com.chk;

public class DemoChkException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 ApplyLicense user=new ApplyLicense("mouli");
	 try {
		user.applyForLicense(17);
		System.out.println("inside try block");
	} catch (AgeException e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
		System.out.println("please apply after: "+ (16-e.getAge()) +" years");
	}
		

	}

}//end of   main block
class AgeException extends Exception{
	//property
	int age;

	public AgeException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AgeException(int age) {
		super();
		this.age = age;
	}
	
	int getAge() {
		return age;
	}	
	
}//end of class body

class ApplyLicense{
      String name;
     // int age;

	  public ApplyLicense() {
		super();
		// TODO Auto-generated constructor stub
	  }
	 public ApplyLicense(String name) {
		super();
		this.name = name;
	 }  
	 
	 //method
	 void applyForLicense(int age)throws AgeException{
		 if(age<16)
			 throw new AgeException(age);
		 else
			 System.out.println("cand eligible for further process");
	 }
}



