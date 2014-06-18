package week4.day2.abstract_p;

public abstract class AbstractWorker {

	private int age = 25;
	private String name = "Anton";
	private double salary = 1000;
	
	public AbstractWorker() {
		
	}

	@Override
	public String toString() {
		return "AbstractWorker [age=" + age + ", name=" + name + ", salary="
				+ salary + "]";
	}
	
	public abstract void work();
	
}
