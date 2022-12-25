package array;

import java.util.Arrays;

public class array_method {
/*
 * 
 * ======ArrayWithMethod===
 *  1> array as argument:
 *  void sum(int a[]){
 *  }
 *  sum (array);
 *2> array as return type:
 *  int  []getData(){
 *  
 *  // = 100,11000,112121
 *  return array;
 *  
 *  }
 *  
 */
	public static void main(String[] args) {
		int data[]= {1,2,3,4,5,6,6,7,34,56};
		String con[]= {"Nepal","Bharat", "Chaina","brazil"};
		int[]x=getOddnumberFrom1to100();
		System.out.println(Arrays.toString(x));
		
		
				
		sum (data);
		printArray(data);
		printCon(con);
	}
//1. array as  argument;
	static void sum(int values[]) {
		int s=0;
		for(int x: values) {
			s= s+x;
			
		}
		System.out.println("TOtal "+s);
	}

 static void printArray(int array[]) {
for (int s :array ) {
		
	System.out.println(s);
	
	
}
}
static void printCon(String array []) {
	 for (String c : array) {
		 System.out.println(c);
	 }
	 
 }
// 2.array return type 
static int [] getOddnumberFrom1to100() {
	int oddnums[]= new int[50];
	int j = 0;
	for(int i=1; i<100; i++) {
		if (i%2 !=0) {
			oddnums[j]=i;
			j++;
		}
		
	}
	return oddnums;
}
/*static int getArray(int array[]){
	int sumnumbers[] = new int[10];
	
	int a = 0;
	for(int b: array ) {
		
a = a+b;
		System.out.println(a);
		
	}
	return sum;
	
}*/
}
