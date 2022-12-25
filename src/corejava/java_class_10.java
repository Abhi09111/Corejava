package corejava;

public class java_class_10 {
public static void main(String[] args) {
	//Resulting data type after arithmetic operation
	/*
	 * byte + short = int     // int:integer
	 * short + int = int      // char:character
	 * long+ float = float
	 * int + float= float
	 * char + int = int
	 * char + short = int
	 * long + double =  double
	 * float + double = double
	 * 
	 */
	//first one (byte + short = int)
	// second (int + float = float)(short+ float= float)(byte+float=float)
	byte a = 5;
			short b =3;
			int  c =  a+b;
			float y = a+b+7.6f;
			
			System.out.println(y);
			//increment and decrement Operators
			int i= 50;
			int  p= i++; // first p is assigned i then i is incremented
			// int p = i-- then first p ni assigned i then i is decremented
			int j = 45;
			int d= ++j;// first j is incremented then d is assigned j
			System.out.println(j++);
			System.out.println(i++);
			//System.out.println(i);
			System.out.println(++i);
			//System.out.println(i);
			
			
			
}
}
