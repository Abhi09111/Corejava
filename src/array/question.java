package array;


import java.util.Scanner;

public class question {
	public static void main(String[] args) {
	
	int a[] =new int[5];
	int minimum;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Number ");
for (int i=0; i<a.length; i++) {
a[i]=sc.nextInt();
}
minimum = a[0];
for (int i = 1; i<a.length; i++) {
if(a[i]<minimum) {
	minimum=a[i];
}



}
System.out.println(minimum);


	}
	}
	
		
	/*
		int [][] flats;
		flats = new int [2][3];
		flats [0][0]=101;
		flats [0][1]=102; 
		flats [0][2]=103;
		flats [1][0]=201;
		flats [1][1]=202;
		flats [1][2]=203;
		for(int i=0; i<flats.length; i++) {
		for (int j=0; j<flats[i].length; j++) {
			System.out.println(flats[i][j]);
			System.out.println("");
		}
		}
		*/
		
	
	/*static int [] getOddNums() {
		int oddnums[]= new int[2];
		int j = 0;
		for(int i=1; i<=3; i++) {
			if (i%2 !=0) {
				oddnums[j]=i;
				j++;
			}
			
		}
		return oddnums;
	}			
*/
/*
 * 1.> smallest value from given array using method;
 * 
 *  
 */



