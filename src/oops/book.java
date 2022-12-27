package oops;

public class book {
  int id;
  String name;
  int price;
  String author;
  void printbookInfo() {
	  System.out.println("Id = "+id);
	  System.out.println("Name = "+name);
	  System.out.println("Price = "+price);
	  System.out.println("Author = "+author);
  }
  public static void main(String[] args) {
	book b1=new book();
	b1.id=5555;
	b1.name="math";
	b1.author = "R.K Sharma";
	b1.price = 9000;
	b1.printbookInfo();
	book b2 = new book();
	b2.id=223;
	b2.name= "English";
	b2.price=250;
	b2.author="Ram Sing";
	b2.printbookInfo();
}
}
