package com.elec.impl;

import com.elec.tariff.DomesticTariff;

public class DemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetElecBill refr=new GetElecBill();
		
		
		DomesticTariff ref;
		ref=new DomesticTariff_Implement(111,"java");
		
		//calc the tot cost
		int cost=ref.getBill(130);
		System.out.println("tot cost to be paid :"+cost);
		
	  System.out.println("total electicity bill with gst :"+refr.GetElectBill(60));

	}

}
