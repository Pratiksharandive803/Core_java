package com.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class DemoHashSet {

	public static void main(String[] args) {
		
		Set<String> s=new HashSet<>();
		
		//add some objects
		s.add("java");
		s.add("java");
		s.add("Java");
		s.add("spring");
		s.add("apple");
		s.add("zebra");
		s.add("1");
		//listing out all the elements of the collection 
		for(String h:s) {
			System.out.println(h);
		//adding the above to a bulk collection
			Set<String>s1=new HashSet<>();
			s1.add("10");
			s1.add("20");
			s1.addAll(s);
			for(String h1:s1) {
				System.out.println(h1);
				
			}
			System.out.println(s);
			System.out.println(s1);
			
			TreeSet <String>st=new TreeSet<>();
			st.addAll(s);
			
			for(String s2:st) {
				System.out.println(s2);
			}
			
			LinkedHashSet<Integer>ihs=new LinkedHashSet<Integer>();
			ihs.add(10);
			ihs.add(1);
			ihs.add(0);
			ihs.add(21);
			System.out.println(ihs);
		}
		
		
		

	}

}
