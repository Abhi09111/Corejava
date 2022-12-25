
package selection;

import java.util.Scanner;

public class nested_felse {
	/*
	 * ===== Nested If-else===
	 * Syntax
	 * 
	 * if (condition-2)
	 * 
	 */
	public static void main(String[] args) {
		
		
		
		String citizen ;
		int age ;
		boolean voterId;
		Scanner sc = new Scanner(System.in); 
		
		System.out.println( "Enetr the Citizenship" );
		citizen = sc.nextLine();
		
		
		System.out.println("Enter the your age");
		age = sc.nextInt();
		
		System.out.println("show the your voterId card");
		voterId = sc.nextBoolean();
		if(citizen.equals("nepali")) {
if(age>=18) {
				
				if(voterId) {
					System.out.println("you can vote!" );
				}else {
					System.out.println("you dont have voterId");
				}
			}else {
			System.out.println("you r under age");
		}
		}else{
			System.out.println("invalid citizenship !!");
			
		}
	
	}

}

