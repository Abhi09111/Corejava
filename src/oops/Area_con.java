package oops;

public class Area_con {
	int b;
	int h;
	int l;
	Area_con(int b , int h){
		this. b= b;
	this.h = h;
	}
	void printArea() {
		int Area = (b*h)*1/2;
		System.out.println("Total value of Area = " +Area);
	}
	Area_con(int a, int b, int c){
		this.b = a;
		this.h = b;
		this.l = c;
		
		
	}
	void printPerimeter() {
		int peri = b+h+l;
		System.out.println("Total value of Perimeter = "+peri);
	}
	public static void main(String[] args) {
		Area_con a1 = new Area_con(3 , 4);
		Area_con p= new Area_con(3,4,5);
		a1.printArea();
		p.printPerimeter();

		
		
	}

}
