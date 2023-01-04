package com.example.domain;

public class Admin  extends Employee {

	Admin(int empid, String name, String ssn, double salary) {
		super(empid, name, ssn, salary);
		// TODO Auto-generated constructor stub
	}
	void print() {
		super.printEmployee();
	}

	
public static void main(String[] args) {
	Admin a= new Admin(304, "Bill Munroe", "108-23-6509", 75_022.34);
	a.print();
}
}
