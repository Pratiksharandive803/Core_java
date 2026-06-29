//this program is not completely efficient
package com.inherit;

public class DemoInhMain {

	public static void main(String[] args) {
		//create an object of the child class
		
		String []cities= {"pune","blr","hyd"};
		//VendorCities child=new VendorCities(cities);
		
		VendorCities child=new VendorCities(1, "java", cities);
		child.showVendData();//compile/static  time polymorphism
		
		

	}

}
