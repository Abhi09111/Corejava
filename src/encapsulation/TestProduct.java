package encapsulation;

public class TestProduct {
public static void main(String[] args) {
	Product p = new Product();
//	p.id =5555;
//	p.name = "Mobile";
//	p.price = 9000;
//	p.company = "samsung";
	p.setId(5555);
	p.setName("Mobile");
	p.setCompany("Samsung");
	p.setPrice(9000);
//	System.out.println("id "+p.getId());
//	System.out.println("name "+p.getName());
//	System.out.println("price "+p.getPrice());
//	System.out.println("company "+p.getCompany());
	
System.out.println(p);
}
}
