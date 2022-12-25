package array;

import java.util.Arrays;

public class Arraysort {
	public static void main(String[] args) {
		
		int data[]= {3,2,5,1,42,6,17,8};
		Arrays.sort(data);
		System.out.println(Arrays.toString(data));
		for(int i=data.length-1; i>=0; i--) {
			System.out.println(data[i]);
		}
		Arrays.fill(data, 50);
		Arrays.fill(data, 5,7,77);
		System.out.println("\n" +Arrays.toString(data));
		int[]newArray = Arrays.copyOf(data, 5);
		System.out.println(Arrays.toString(newArray));
		System.out.println(Arrays.toString(Arrays.copyOfRange(data, 2, 7
				)));
	}

}
