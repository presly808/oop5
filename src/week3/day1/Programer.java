package week3.day1;

public class Programer extends Worker {

	private int experience;
	private String level;
	
	public Programer() {
		super();
	}
	
	public Programer(String fullname, int age, double salary) {
		super(fullname, age, salary);
	}
	
	public void code(){
		System.out.println("Im coding");
		experience += 10;
	}
	
}
