package com.elec.tariff;

public interface DomesticTariff {
	//declare constants
	int MIN_CHGS=50;
	//public static final int MIN_CHGS=50;
	float  Z_50_UC=0.75f;
	float FIFTY_1_100_UC=1.2F;
	float GT_100_UC=1.5f;
	
	 int getBill(int units);
	
	

}
