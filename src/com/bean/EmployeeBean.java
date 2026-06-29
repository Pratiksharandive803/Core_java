package com.bean;

public class EmployeeBean {
	
	//properties
	private Integer emp_id;
	private String emp_name;
	private Integer emp_bsal;
	
	
	public EmployeeBean() {
		super();
		// TODO Auto-generated constructor stub
	}


	public EmployeeBean(Integer emp_id, String emp_name, Integer emp_bsal) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_bsal = emp_bsal;
	}
   
   //setter and getter methods
	public Integer getEmp_id() {
		return emp_id;
	}


	public void setEmp_id(Integer emp_id) {
		this.emp_id = emp_id;
	}


	public String getEmp_name() {
		return emp_name;
	}


	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}


	public Integer getEmp_bsal() {
		return emp_bsal;
	}


	public void setEmp_bsal(Integer emp_bsal) {
		this.emp_bsal = emp_bsal;
	}


	
	
	
	

}
