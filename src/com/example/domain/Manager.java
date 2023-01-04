package com.example.domain;

public class Manager extends Employee{
	private String dpName;

	public Manager(int empid, String name, String ssn, double salary , String dpName) {
		super(empid, name, ssn, salary);
		this.dpName = dpName;
		// TODO Auto-generated constructor stub
	}

	public String getDpName() {
		return dpName;
	}


void printManager() {
	super.printEmployee();
	System.out.println("Department "+dpName);
}
	


public static void main(String[] args) {
	Manager mr= new Manager(207, "Barbara Jonhson", "054-12-2367", 109_501.36, "US Marketing");
	mr.printManager();
}

	 }
	
	


