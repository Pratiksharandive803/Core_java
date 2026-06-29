package com.collection;

import java.util.HashSet;
import java.util.Set;

public class DemoSet {

	public static void main(String[] args) {
     Set<Employee>s=new HashSet<>();
     //add objects of employee
     Employee e1=new Employee(1,"java");
     Employee e2=new Employee(1,"java");
     Employee e3=e2;
     Employee e4=new Employee(2,"java");
     s.add(e1);
     s.add(e2);
     s.add(e3);
     s.add(e4);
     //checking for equality
     System.out.println("is e1 equql to e2"+(e1.equals(e2)));
     System.out.println("is e3 equql to e2"+(e3.equals(e2)));
     //let's look at the hashcode
     System.out.println("e1 hashcode"+e1.hashCode());
     System.out.println("e2 hashcode"+e2.hashCode());
     System.out.println("e4 hashcode"+e4.hashCode());
     
	}

}

class Employee {
	Integer emp_id;
	String emp_name;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(Integer emp_id, String emp_name) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
	}
	
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + "]";
	}
	
	@Override
	public int hashCode() {
		return emp_id+1;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if((obj instanceof Employee) && (((Employee)obj).emp_id==this.emp_id))
             return true;
         else {
        	 return false;
	
	}
	
	
	}
    	
}
