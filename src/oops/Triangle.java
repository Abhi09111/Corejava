package oops;

public class Triangle {
int length;
int breadth;
Triangle(){
	
}
Triangle(int l,int b){
	length = l;
	breadth = b;
}

int Area() {
	  
	return  length *breadth;
}
public static void main(String[] args) {
	Triangle a = new Triangle(4,5);
	Triangle a1 = new Triangle(5,8);
	System.out.println(a.Area());
	System.out.println(a1.Area());
}

}
