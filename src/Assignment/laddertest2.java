package Assignment;

import java.util.Scanner;

public class laddertest2 {
public static void main(String[] args) {
/*
A student will not be allowed to sit in exam if his/her attendence is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not.
*/
	Scanner sc  = new Scanner(System.in);
	int CH;
	int CA;
	float PCA;
	System.out.println("Enter the total classes hold ");
	CH=sc.nextInt();
	System.out.println("Enter the total classes Attended");
	CA=sc.nextInt();
	PCA=(CA-CH)/3.65f;
	System.out.println("percentage of classes attended " +PCA +"%");
	if(PCA>=75) {
		System.out.println("This Student is Allowed to sit in exam");
	}else {
		System.out.println("This Student unable to sit in exam");
	}
		
}
}
