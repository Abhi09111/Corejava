package oops;

public class user {
	// instance variable
	String username;
	String password;
  // ==== default constructor======
	user(){
		username="root";
		password ="123"; 
		
	}
	 // ==============Parameterized constructor===========("this" keyword represent current object)
	user ( String user,String psw){
		this.username = user;
		this.password = psw;
	}
	void print() {
		System.out.println("UserName ="+username);
		System.out.println("Password ="+password);
	}
public static void main(String[] args) {
	user u = new user(" hari", " 22345");
	//u.password="444";
	u.print();
}
}
