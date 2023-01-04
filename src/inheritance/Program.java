package inheritance;


public class Program extends Employee{
	String proglog;
	String project;
	int bonus;
	void print()
	{
		super.print();
		System.out.println("Programmer Lang. "+proglog);
		System.out.println("Project = "+project);
		System.out.println("Bonus = "+bonus);
	}
	public static void main(String[] args) {
		Program pg = new Program();
		pg.id=1;
		pg.name = "ram";
		pg.age = 24;
		pg.salary =70000;
		pg.bonus= 30000;
		pg.proglog="java";
		pg.project="EMS";
		pg.print();
				
	}
	

}
