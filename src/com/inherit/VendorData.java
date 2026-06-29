package com.inherit;

public class VendorData {//parent class /super class 
	
	//properties
	 private int vend_id;
	private String vend_name;
	
	//constructor
	public VendorData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VendorData(int vend_id, String vend_name) {
		super();
		this.vend_id = vend_id;
		this.vend_name = vend_name;
	}
	
	void showVendData() {
		System.out.println("parent class data "+vend_id+"\t"+vend_name);
	}
	

}
