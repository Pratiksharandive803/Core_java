package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//list----sequence
		List<Integer> l=new ArrayList<>();
		//ArrayList al=new ArrayList();
		//add an object
		l.add(10);
		l.add(20);
		//l.add("java");
		//l.add(20.55f);
		l.add(10);
		
		//list out the elements
		Iterator i=l.iterator();
		 while(i.hasNext())
			 System.out.println(i.next());
		 //for each
		 for(Integer o:l)
			 System.out.println(o);
		 
		 //for simply display
		 System.out.println(l);
		 
		 //check  the size
		 System.out.println("length of the collection :"+l.size());
		 System.out.println("it is available :"+l.contains(100));
		 
		 //remove
		 l.remove(0);
		 System.out.println(l);
		 
		 l.add(0, 50);
		 System.out.println(l);

	}

}
