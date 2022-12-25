package Assignment;

import java.util.Scanner;

public class laddertest {
	//Take input of age of 3 people by user and determine oldest and youngest among them.
public static void main(String[] args) {
	int age;
	int age1;
	int age2;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter The Age Of First Persion");
	age=sc.nextInt();
	if(age>=60) {
		System.out.println("Oldest Persion ");
	}
	else if(age>=18) {
		System.out.println("Youngest Persion");	
	}
	else{
	
	System.out.println("child");
	
	}
	System.out.println("Enter The Age Of Second Persion");
	age1 =sc.nextInt();
	if(age1>=60) {
		System.out.println("Oldest Persion ");
	}
	else if(age1>=18) {
		System.out.println("Youngest Persion");
		
		
		
	}
	else{
	
	System.out.println("child");
			
	}
	System.out.println("Enter The Age Of Third Persion");
	age2= sc.nextInt();
	
	if(age2>=60) {
		System.out.println("Oldest Persion ");
	}
	else if(age2>=18) {
		System.out.println("Youngest Persion");
		
		
		
	}
	else{
	
	System.out.println("child");
			

}
}
}
