package com.demo.stat;

public class DemoFundsCollected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FundsCollected obj1=new FundsCollected("ganesh",1000);
		FundsCollected obj2=new FundsCollected("Dnyaneshwar",1000);
		System.err.println("tot funds collected:"+FundsCollected.getTotFunds());
		
		

	}

}
class FundsCollected{
	String donar_name;
	int donar_amt;
	 static int tot_funds_coll=0;
	 
	 static int getTotFunds() {
		 return tot_funds_coll;
	 }

	 public FundsCollected() {
		super();
		// TODO Auto-generated constructor stub
	 }

	 public FundsCollected(String donar_name, int donar_amt) {
		super();
		this.donar_name = donar_name;
		this.donar_amt = donar_amt;
		tot_funds_coll+=donar_amt;
	 }
	 
	 
	 
}
