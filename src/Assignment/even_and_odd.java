package Assignment;

import java.util.Scanner;

public class even_and_odd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		
System.out.println("Enter The Number");
a=sc.nextInt();
if(a%2==0) {
	System.out.println("This is a Even Number");
}
else {

		System.out.println("This is a Odd Number");
	}

}
}