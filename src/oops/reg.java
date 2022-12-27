package oops;

import java.util.Scanner;

public class reg {
	int l;
	int b;
	
	void printArae() {
		int a = l*b;
		System.out.println("Total value "+a);
		
		
		
	}
	void printPM() {
		int c= 2*(l+b);
		System.out.println("Total value "+c);
		
	}
	
	public static void main(String[] args) {
		reg area=new reg();
		reg PM=new reg();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enetr The lenth");
		
		area.l = 50;
		area.b= 40;
		PM.l=30;
		PM.b= 20;
		area.printArae();
		PM.printPM();
		
		
	}

}
// hw 5  new class
