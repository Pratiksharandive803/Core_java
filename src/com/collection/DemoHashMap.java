package com.collection;

import java.util.HashMap;
import java.util.Map;

public class DemoHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Map<Integer, String>m=new HashMap<Integer, String>();
     
     //add objects
     m.put(91,"india");
     m.put(911,"usa");
     m.put(65,"singapore");
     m.put(62,"malaysia");
     m.put(65,"malaysia");
     

     //list out all the elements
     System.out.println(m);
     
     //retrive a specific object
     System.out.println(m.get(91));
     System.out.println(m.containsKey(91));
     
     
	}

}
