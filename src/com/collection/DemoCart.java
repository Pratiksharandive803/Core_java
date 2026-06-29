package com.collection;

import java.util.HashMap;
import java.util.Map;

public class DemoCart {

	public static void main(String[] args) {

        //definition the items in the map
		Map<Integer,ItemDescription>item_desc=new HashMap<Integer, ItemDescription>();
		 item_desc.put(1, new ItemDescription("apple",40.5f));
		 item_desc.put(2, new ItemDescription("orange",30.15f));
		 
		 //add items to the cart
		 Map<Integer, Integer>cart=new HashMap<Integer, Integer>();
		 cart.put(1, 10);
		 cart.put(2, 20);
		 
		 //chkout
		 ChKOut payment=new ChKOut();
		 System.out.println("tot payment:"+payment.pay(item_desc, cart));
	 
		 
	}

}

class ChKOut{
	int totcost=0;
	int pay(Map<Integer, ItemDescription> itemDesc,Map<Integer, Integer>cart) {
		//gettng all the entries from the cart
		//looping thru the end of the cart
		for(Map.Entry<Integer, Integer>crt:cart.entrySet()){
			ItemDescription item=itemDesc.get(crt.getKey());
			totcost+=item.unitCost*crt.getValue();
			
		}
		return totcost;
	}
}


class ItemDescription{
	//properties
	String itemDesc;
	float unitCost;
	
	public ItemDescription() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ItemDescription(String itemDesc, float unitCost) {
		super();
		this.itemDesc = itemDesc;
		this.unitCost = unitCost;
	}
	
	
}
