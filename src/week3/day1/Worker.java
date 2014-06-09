package week3.day1;

public class Worker {

	private String fullname;
	private int age;
	private double salary;
	
	public Worker() {
		super();
	}

	public Worker(String fullname, int age, double salary) {
		this.fullname = fullname;
		this.age = age;
		this.salary = salary;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
