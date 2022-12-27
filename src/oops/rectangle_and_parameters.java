package oops;

import java.util.Scanner;

public class rectangle_and_parameters {
	int  Length;
	int  breadth;
void setDim() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter The Length");
	Length = sc.nextInt();
	System.out.println("Enter The Breadth");
	breadth = sc.nextInt();

	
}
int getArea() {
	int a = Length * breadth ;
	System.out.println("Total Vaalue of Area = " +a);
	return a;
}
public static void main(String[] args) {
	rectangle_and_parameters a=new rectangle_and_parameters();
	
	
	a.setDim();
	System.out.println("the area is"+a.getArea());
	
}
}
