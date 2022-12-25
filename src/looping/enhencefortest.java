package looping;

public class enhencefortest {
	/*
	 * Syntax
	 * for(data_typre var : collection){
	 * 
	 *    //  statement
	 * }
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		int data []= {1,62,37,6,4,2,92,0,8};
		int sum = 0;
		for(int x: data) {
			System.out.println(x);
			sum = sum + x;
			System.out.println("Total sum "+ sum);
		}
		
		
		
	
				
	}

}
