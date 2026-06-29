package com.demo.dyn;

public class DemoDynDispatch {

	public static void main(String[] args) {
		
		Employee emp;//reference variable to the abstract class
		//emp=new Employee();//cannot create the objcet for an abstract class
		
		//get the salary for the regular employee
		/*emp=new RegularEmp(1,"java",13000);
		int reg_emp_sal=emp.getEmpSal();
	    System.out.println("regular emp sal"+reg_emp_sal);*/
		
		emp=new RegularEmp(1,"java",13000);
		int reg_emp_sal=emp.getEmpSal();
		System.out.println("regular emp sal:"+reg_emp_sal);
	    
	    //get the salary for the contract employee
	    emp=new ContractEmp(11,"spring");
	    int contr_emp_sal=emp.getEmpSal();
	    System.out.println("Contract emp sal:"+contr_emp_sal);

	}

}

abstract class Employee{
	int emp_id;
	String emp_name;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int emp_id, String emp_name) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
	}

    void showEmpData() {//concrete method
	System.out.println("emp data"+emp_id+" "+emp_name);
    }

    abstract int getEmpSal(); //abstract method
	

	
	
  }

//child class
class RegularEmp extends Employee{
	int bsal;

	public RegularEmp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RegularEmp(int emp_id, String emp_name,int bsal) {
		super(emp_id, emp_name);
		this.bsal=bsal;
		// TODO Auto-generated constructor stub
	}


	@Override
	int getEmpSal() {
		// TODO Auto-generated method stub
		return bsal*2;
	}
	
	
	
}

class ContractEmp extends Employee{
	

	public ContractEmp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContractEmp(int emp_id, String emp_name) {
		super(emp_id, emp_name);
		// TODO Auto-generated constructor stub
	}

	@Override
	int getEmpSal() {
		// TODO Auto-generated method stub
		return 25000;
	}
	
}
