package selection;

import java.util.Scanner;

public class if_elses {
	public static void main(String[] args) {
		/*
		 * =========if-else=======
		 * 
		 * 
		 * 
		 * syntax
		 * 
		 * 
		 * 
		 * if(condition){
		 *    //statement
		 *    
		 *    }
		 *    else{
		 *      ///statement
		 *      }
		 *      
		 */
		
		
		
		int n ;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println("Enter The number");
		
		
		if(n%2==0) {
			System.out.println(n+ " is even number");
			
		}
		else {
			System.out.println(n + "is odd number");
		}
	}

}
