package oops;

import java.util.Scanner;

public class car { // bmw,toyota,faraari,audi,jaguar
	String compeny_name;
	String car_name;
	int price;
	void BMW() {
		System.out.println(""+car_name);
		System.out.println(" "+compeny_name);
		System.out.println(""+price);
	}
	
public static void main(String[] args) {
	car bmw=new car();
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter The Car Name");
	bmw.car_name = sc.nextLine();
	bmw.BMW();
}
}
