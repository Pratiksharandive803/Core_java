package com.elec.impl;

import com.elec.tariff.DomesticGST;
import com.elec.tariff.DomesticTariff;

public class GetElecBill implements DomesticTariff,DomesticGST {
	
	// Properties 
			int cons_id;
			String cons_name;


		public GetElecBill() {
				super();
				// TODO Auto-generated constructor stub
			}

		
		public GetElecBill(int cons_id, String cons_name) {
			super();
			this.cons_id = cons_id;
			this.cons_name = cons_name;
		}


		@Override
		public double addGst(double totalCost) {
			// TODO Auto-generated method stub
			return totalCost * EIGHTPER;
		}
		
		float GetElectBill(int units) {
			int newBill = (int)getBill(units);
			float gst = (float) addGst(newBill);
			return newBill+gst;
		}


		@Override
		public int getBill(int units) {
			// TODO Auto-generated method stub
			int tot_cost = 0;
			if (units >= 0 && units <=50) {
				tot_cost += calc_0_50(units);	
			}
			else if (units >50 && units <=100) {
				tot_cost += calc_51_100(units);
			}
			else {
				tot_cost += calc_gt_100(units);
			}
			return tot_cost;
		}
		
		int calc_0_50 (int units) {
			return (int)(units * Z_50_UC + MIN_CHGS);
		}
		
		int calc_51_100 (int units) {
			int sub = 0;
			sub += calc_0_50 (50);
			int temp = units -50;
			sub += temp*FIFTY_1_100_UC;
			return sub;
		}

		int calc_gt_100(int units) {
			int sub = 0;
			sub += calc_51_100(100);
			int temp = units -100;
			sub += temp * GT_100_UC;
			return sub;
		
		}

	}
