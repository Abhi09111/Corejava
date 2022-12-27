package oops;

public class Employee {
String name;
int salary;
int year;
String address;
void Robert() {
	System.out.print("Name :- " + name );
	System.out.print(" ,Salary :- Rs." +salary +"/-");
	System.out.print(" ,Year :- " +year +"A.D");
	System.out.print(" ,Address :- "+address);
	
}
public static void main(String[] args) {
	Employee e1 = new Employee ();
	e1.name = "Robert";
	e1.salary = 60000;
	e1.year=1994;
	e1.address ="64C-WallsStreat";
	e1.Robert();
	
}
}
