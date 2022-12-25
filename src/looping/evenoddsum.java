package looping;

public class evenoddsum {
	public static void main(String[] args) {
		int es = 0;
		int os = 0;
		for(int i=1; i<=100; i++) {
			if(i%2==0) {
				es = es + i;
				
			}else {
				os = os + i;
			}
			
		}
		System.out.println(es);
		System.out.println(os);
		System.out.println(es+os);
		
	}

}
