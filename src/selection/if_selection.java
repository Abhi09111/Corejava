package selection;

import java.util.Scanner;

public class if_selection {
	private static char[] multiply;

	public static void main(String[] args) {
		/* 
		 * ,    syntax
		 * 
		 * 
		 * 
		 * if (condition){}
		 */

		
		 //int salary ;
		//Scanner sc = new Scanner(System.in);
		// System.out.println("Enter Your Salary");
		// salary = sc.nextInt();
		// salary = salary + 8000;
		// System.out.println("your total salary = " +salary);
		
		
		/*
		int l;
		 int b;
		
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter the value L");
		 l= sc.nextInt();
		 System.out.println("Enter The Value B");
		 b= sc.nextInt();
		 int a = l*b;
		 if (l>0 && b>0) {
		 System.out.println("Total Area\n "+a);
		 }
		 */
		
		float p;
		float t;
		float r;  
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of p");
		p = sc.nextFloat();
		System.out.println("enter the rate %");
		r= sc.nextFloat();
		System.out.println(" enter the time per year");
		t = sc.nextFloat();
		float s= p*t*r/100;
		
		if (p>0) {
			System.out.println( s);
		}
		
		
		
		
		
		
		 
	}

}
