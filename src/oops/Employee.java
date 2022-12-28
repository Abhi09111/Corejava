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
	System.out.println(" ,Address :- "+address);
	
}
void sam() {
System.out.print("Name :- " + name );
System.out.print(" ,Salary :- Rs." +salary +"/-");
System.out.print(" ,Year :- " +year +"A.D");
System.out.println(" ,Address :- "+address);
}
void john() {
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
	Employee e2 = new Employee ();
	e2.name = "Sam";
	e2.salary = 20000;
	e2.year=2000;
	e2.address ="68d-WallsStreat";
	e2.sam();
	Employee e3 = new Employee ();
	e3.name = "John";
	e3.salary = 40000;
	e3.year=1999;
	e3.address ="26B-WallsStreat";
	e3.john();
	
}
}
//Robert 1994 64C- WallsStreat
//Sam 2000 68D- WallsStreat
//John 1999 26B- WallsStreat