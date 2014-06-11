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

	@Override
	public boolean equals(Object obj) {
		if(obj == null){
			return false;
		}
		
		if(this == obj){
			return true;
		}
		
		if(!(obj instanceof Worker)){
			return false;
		}
		
		//Casting reference obj to other for get access to fields
		Worker other = (Worker) obj;
		
		if(this.age == other.age && 
					this.fullname.equals(other.fullname) && 
					this.salary == other.salary) {
			return true;
		}
		
		return false;
	}

	@Override
	public String toString() {
		return "Worker : fullname=" + fullname + ", age=" + age + ", salary="
				+ salary;
	}

	
	
}
