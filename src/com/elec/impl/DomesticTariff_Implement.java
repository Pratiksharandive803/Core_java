package com.elec.impl;

import com.elec.tariff.DomesticTariff;


public class DomesticTariff_Implement implements DomesticTariff{
	
	private static final int GST_RATE = 0;
	//properties
	int cons_id;
	String cons_name;
	
		public DomesticTariff_Implement() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public DomesticTariff_Implement(int cons_id, String cons_name) {
		super();
		this.cons_id = cons_id;
		this.cons_name = cons_name;
	}
   
	@Override
	public int getBill(int units) {
		// TODO Auto-generated method stub
		
		int tot_cost=0;
		//checking for the condition
		if(units>=0 && units<=50) {
			tot_cost+=calc_0_50(units);
		}
		else if(units>=50 && units<=100) {
			tot_cost+=calc_51_100(units);
		}
		else {
			tot_cost+=calc_gt_100(units);
		}
		
		
		
		
		return tot_cost;
	}
	
	int calc_0_50(int units) {
		return(int) (units*Z_50_UC);
	}
	
	
	int calc_51_100(int units) {
		int sub=0;
		sub+=calc_0_50(50);
		int temp=units-50;
		sub+=temp*FIFTY_1_100_UC;
		return sub;
	}
	
	
    int calc_gt_100(int units) {
    	int sub=0;
    	sub+=calc_51_100(100);
    	int temp=units-100;
    	sub+=temp*GT_100_UC;
    	return sub;
    }


	
}
