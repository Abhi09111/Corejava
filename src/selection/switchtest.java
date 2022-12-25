package selection;

import java.util.Scanner;

public class switchtest {
	/*
	 *  syntax
	 *  switch(variable){
	 *  case 1:
	 *    // statement
	 *    break;
	 *    case 2:
	 *     /// sTATEMENT
	 *     break;
	 *      case3:
	 *      //statement
	 *      break;
	 *      .....
	 *      default:
	 *      // statement
	 *      }
	 */
public static void main(String[] args) {
	
	int day;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the day ");
	day=sc.nextInt();
	switch(day){
	case 1 :
		System.out.println("sunday");
		break;
	case 2:
		System.out.println("monday");
		break;
	case 3:
		System.out.println("tueday");
		break;
	case 4:
		System.out.println("wednsday");
		break;
	case 5:
		System.out.println("thursday");
		break;
	case 6:
		System.out.println("friday");
		break;
	case 7:
		System.out.println("satday");
		break;
		default:
			System.out.println( "sunday,monday,tuesday, wedneday,thursday,friday,saturday");
	
		
	}

}

}









/*
 * wap to calcutate total salary for following post 
 * 
 * pos             basic salary          bonus          total salary 
 * md              400000                29.89%        ?
 * ceo              538000                15%           ?
 * Manager           280000                7%           ?
 * helper               20000             7.98%         ?
 * 
 * 
*/