package com.demo.stat;

public class CountMonkeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountNoOfMonkeys ojb1=new CountNoOfMonkeys();
		CountNoOfMonkeys obj2=new CountNoOfMonkeys();
		CountNoOfMonkeys obj3=new CountNoOfMonkeys();
		CountNoOfMonkeys obj4=new CountNoOfMonkeys();
		
		//getting the count of monkeys
		System.err.println("tot no  of monkeys are:"+CountNoOfMonkeys.getCount());
		

	}

}

class CountNoOfMonkeys{
	
	 static int count=0;
	
	public CountNoOfMonkeys() {
		super();
		// TODO Auto-generated constructor stub
		count+=1;
	}

	
	static int getCount() {
		return count;
	}	
}
