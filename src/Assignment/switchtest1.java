package Assignment;

import java.util.Scanner;

public class switchtest1 {  
	public static void main(String[] args) {
		
	
	int jobposition;
	float  TS;
	int salary;
	float bonus;
	String md,ceo,manager,helper;
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the Job Position "+ "1,MD " + "2,CEO " + "3,Manager " +"4,Helper " );
	jobposition = sc.nextInt();
	

	
	switch(jobposition) {
	case 1:
		System.out.println("MD");
		TS = 400000+(400000*29.89f/100);
		System.out.println("Here Is Your Total Salary" +TS);
		
		break;
	case 2:
		System.out.println("CEO");
		TS =538000+(538000*15/100); 
		System.out.println("Here Is Your Total Salary" +TS);
		break;
	case 3:
		System.out.println("Manager");
		TS =280000+(280000*7/100); 
		System.out.println("Here Is Your Total Salary" +TS);
		break;
	case 4:
		System.out.println("Helper");
		TS =20000+(20000*7.98f/100); 
		System.out.println("Here Is Your Total Salary" +TS);
		break;
		default:
			System.out.println("wrong information");
		
		
	
	}
	
}
}