package corejava;
import java.util.Scanner;


public class solution_video {
	private static char[] percentage;


	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the full marks" );
		int n = sc.nextInt();
		System.out.println("Enter the first subject marks");
		float f =  sc.nextFloat();
		System.out.println("Enter the second subject marks");
		float s = sc.nextFloat();
		System.out.println("Enter the three subject marks");
		float t = sc.nextFloat();
		System.out.println("Enter the four subject marks");
		float fo = sc.nextFloat();
		System.out.println("Enter the five subject marks");
		float fi = sc.nextFloat();
		float percentage = (f+s+t+fo+fi)/5;
		System.out.println("find the percentage");
		System.out.println(percentage);
				
		
		
		//asky your name and say hello name its a greatful day 
		
	//	System.out.println("what is your name");
	//	Scanner sc = new Scanner(System.in);
	//String name = sc .next();
		//System.out.println("Hello "+ name +" its a greatful day");
		//convert the kilometer to miles
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the  kilometer:");
		 float km = sc.nextFloat();
		 float miles = (float)(0.62137119 * km);
		 System.out.println("distance in miles will be : "+miles);
		 */
	
		
	}

}
