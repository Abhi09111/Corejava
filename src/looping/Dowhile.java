package looping;

public class Dowhile {
	/*
	 * 
	 * 
	 * syntax
	 * 
	 *   do{dec
	 *   //st
	 *   /inc/
	 *   }while
	 *   
	 */
public static void main(String[] args) {
	int n = 9;
	int i = 1;
	do {
		System.out.println(n+" x "+i+" = "+(n*i));
		i++;
	}while(i<=10);
}
}
