package oops;

public class student {
String name;
int roll_no;
String address;
long phone_no;
void printStudentInfo() {
	System.out.println("Student name is "+name);
	System.out.println("Roll no = "+roll_no);
	
}
void studentSum() {
	System.out.println(" Sum Address "+ address);
	System.out.println("Sum Phone Number " +phone_no);
	System.out.println("Sum Roll No "+ roll_no);
	
}
void studentJohn() {
	System.out.println(" John Address "+ address);
	System.out.println("John Phone Number " +phone_no);
	System.out.println("John Roll No "+ roll_no);
}
public static void main(String[] args) {
	student s1 = new student();
	s1.name = "Ram B.K";
	s1.roll_no = 1;
	s1.printStudentInfo();
	student s2 = new student();
	s2.name = "Hari Bist";
	s2.roll_no = 2;
	s2.printStudentInfo();
	student s3 = new student();
	s3.roll_no = 3;
	s3.address = "Doti,Nepal";
	s3.phone_no= 9868811233l;
	s3.studentSum();
	student s4 = new student();
	s4.roll_no = 4;
	s4.address = "KTM,Nepal";
	s4.phone_no= 9868656433l;
	s4.studentJohn();
	
}
}
