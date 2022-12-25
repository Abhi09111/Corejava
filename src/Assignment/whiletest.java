package Assignment;

import java.util.Scanner;

public class whiletest {
	public static void main(String[] args) {
		int n;
		int fact ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		n= sc.nextInt();
		System.out.println("Enter the factorial number");
		fact = sc.nextInt();
		while(n>1) {
		fact =  fact*n;
			n--;
			System.out.println("factorial " + fact);
			
					
		}
	}

}
