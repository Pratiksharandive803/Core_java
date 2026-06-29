package com.inherit;

public class VendorCities  extends VendorData{
	String[] cities;


	public VendorCities() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VendorCities(int vend_id, String vend_name,String[]cities) {
		super(vend_id, vend_name);
		// TODO Auto-generated constructor stub
		this.cities=cities;
	}


	//method overriding
	void showVendData() {
		super.showVendData();//invoke super class method
		for(int i=0;i<cities.length;i++) {
			System.out.println(cities[i]);
		}
	}
	
	
	

}
