
package Methord;

public class methodtest {
public static void main(String[] args) {
	sum();
	area(30,50);
	int x = getSumOf1to100();
	System.out.println("Sum of 1 to 100" + x);
	int sv =findSmaillestValue(500, 1000);
	System.out.println("Smallest value =" +sv);
	// 1. no return_type with no arguments

}
	static void sum () {
		int a= 9000;
		int b= 5000;
		int s= a+b;
		System.out.println("total = " +s);
		
}

// 2. no return_type with arguments
	
	
	static void area(int l,int b) {
		int ar = l*b;
		System.out.println("area = " +ar);
		
	}

	// 3. return_type with no arguments
	
	static  int getSumOf1to100() {
		int s = 0;
	
for(int i=1; i<=100; i++) {		
		
		s= s+i;
	
	}
return s;
	}
	// 4. return_type with arguments
	static int findSmaillestValue(int x, int y) {
		
		if (x<y) {
			return x;
			
		}
		else {
			return  y;
			
		}
	}
	
}