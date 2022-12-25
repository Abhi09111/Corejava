package selection;

import java.util.Scanner;

public class LadderTest {
	/*
	 * 
	 * 
	 * 
	 * =========else if=======
	 * 
	 * 
	 * syntax:
	 * if(  condition1){
	 * 
	 * }
	 * else if (condition 2){
	 * }
	 * else if (condition 3)
	 * 
	 * 
	 *{}
	 
	 * else if (condition  4){}
	 * 
	 * 
	 * 
	 * 
	 */
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int marks;
	System.out.println("Enter the Student Marks");
	marks=sc.nextInt();
			if( marks >=80) {
				System.out.println("Distinction");
				
				
			}
			else if (marks>=60) {
				System.out.println("First");
				
				
			}
			else if(marks>=45) {
				System.out.println("Second");
			}
			else if (marks>=32) {
				System.out.println("third");
				
				
				
			}
			else {
				System.out.println("failed");
			}
}
}
