
package Assignment;

import java.util.Scanner;

public class Do_While_loopin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int i;
		System.out.println("Enter the number");
		a= sc.nextInt();
		System.out.println("Enter The  Start  Number ");
		i=sc.nextInt();
		
		do{
			System.out.println(a+"x" +i+ "=" +(a*i));
			i++;
			
		}while(i<=10);
	}

}
