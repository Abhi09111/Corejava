package com.example.domain;

public class Director extends Manager {
	private double budget;
	public Director(int empid, String name, String ssn, double salary, String dpName , double budget) {
		super(empid, name, ssn, salary, dpName);
		this.budget=budget;
		// TODO Auto-generated constructor stub
	

	
	}
	public double getBudget() {
		return budget;
	}
	public void setBudget(double budget) {
		this.budget = budget;
	}

}
