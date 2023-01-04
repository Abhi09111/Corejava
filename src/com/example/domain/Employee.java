package com.example.domain;

public class Employee {
	private int empid;
	private String name;
	private String ssn; 
	private double salary;
	 
	Employee(int empid , String name, String ssn , double salary){
		this.empid=empid;
		this.name=name;
		this.ssn=ssn;
		this.salary=salary;
		
	}

	public int getEmpid() {
		return empid;
	}

	

	public String getName() {
		return name;
	}



	public String getSsn() {
		return ssn;
	}

	

	public double getSalary() {
		return salary;
	}


	
	double raiseSalary() {
		double increase = 20 ;
	salary  = increase + salary;
			
			return salary;
		
	}
	void printEmployee() {
		System.out.println(" ID     "+empid);
		System.out.println("Name  "+name);
		System.out.println("SSN    "+ssn);
		System.out.println("Salary "+salary);
		
		
	}
	

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", ssn=" + ssn + ", salary=" + salary + "]";
	}
	

}
