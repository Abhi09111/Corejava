package looping;

public class jumpingtest {

	/*=====jumping statement====
	 * 1 break; : exit from  loop
	 *2 continue;:skip values
	 *3 return; :exit from method
	 * 
	 * 
	 * 	 */
	public static void main(String[] args) {
		for( int i=1; i<10; i++) {
			if(i==5) {
				break;
			}if(i==5 || i==8) {
				//continue;
			}
			
			
				
			System.out.println(i);
		}
			
		
		System.out.println("end for loop");
	}
}