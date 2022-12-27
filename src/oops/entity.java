package oops;

public class entity {  //  //car //mobile phone,bike,
	int model_no;
	String model_name;
	String compeny_name;
	int price;
	int lunch_date;
	void printCarEntity() {
		System.out.println("  Model Name "+model_name);
		System.out.println(" Compeny Name "+compeny_name);
		
		System.out.println("  Price of car "+price);
		
		
		
	}
	
	void printMobileEntity() {
		System.out.println("Enter The Model Name "+model_name);
	System.out.println("Enetr The Compeny Name "+compeny_name);
	System.out.println("Enter The Car Model No "+model_no);
	System.out.println("Enter The Price of car "+price);
	System.out.println("Enter The Lunch Date "+lunch_date);
	
	}void printBikeEntity(){
		System.out.println("Enter The Model Name "+model_name);
	System.out.println("Enetr The Compeny Name "+compeny_name);
	System.out.println("Enter The Car Model No "+model_no);
	System.out.println("Enter The Price of car "+price);
	System.out.println("Enter The Lunch Date "+lunch_date);
	}
	public static void main(String[] args) {
		entity car = new entity();
		entity car1=new entity();
		entity car2=new entity();
		entity mobile = new entity();
		entity bike = new entity();
		car1.model_name = "BMW X5";
		car1.compeny_name ="BMW";
		car1.price =  950000;
		car1.printCarEntity();
		car.model_name = "BMW X1";
		car.compeny_name ="BMW";
		car.price = 45000;
		car.printMobileEntity();
		
				}
}
