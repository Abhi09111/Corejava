package oops;

public class Area$Para {
	int h;
	int b;
	int l;
	//default Constructor
	void printArea() {
		int Area = (b*h)*1/2;
		System.out.println("Total value of Area = " +Area);
		
	}
	void printperimeter() {
		int peri=b+h+l;
		System.out.println("The total value of perimeter = " +peri);
	}
public static void main(String[] args) {
	Area$Para a=new Area$Para();
	a.b = 3;
	a.h=4;
	a.printArea();
	Area$Para p= new Area$Para();
	p.b=3;
	p.h=4;
	p.l=5;
	p.printperimeter();
}
//Parameterized Constructor

}
