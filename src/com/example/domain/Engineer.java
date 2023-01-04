package com.example.domain;

public class Engineer extends Employee{

	
	Engineer(int empid, String name, String ssn, double salary) {
		super(empid, name, ssn, salary);
		// TODO Auto-generated constructor stub
	}

	
	void print() {
		super.printEmployee();
	}

	public static void main(String[] args) {
		Engineer er = new Engineer(101, "Jene Smith","012-34-5678", 120_345.27 );
		er.print();

	}

}
