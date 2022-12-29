package oops;

import java.util.Scanner;

public class Area {
	int length;
	int breadth;
	Area(){
		
	}
	Area(int l, int b){
	length=l;
	breadth=b;
	}
	int returnArea() {
	return length*breadth;
	
	
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the length");
	int l = sc.nextInt();
	System.out.println("Enter the breadth");
	int b = sc.nextInt();
	
	Area a = new Area(l,b);
	System.out.println(a.returnArea());
	


	
}
}
