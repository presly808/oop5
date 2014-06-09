package week3.day1;

public class Machine {
	
	private String model;
	private int year;
	static int count;

	public Machine() {
		count++;
	}

	public Machine(String model, int year) {
		this.model = model;
		this.year = year;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public static int getCount(){
		return count;
	}
	
	public void nonStaticMeth(){
		count++;
	}
	
	public static void test(){
		
	}
	
	
}
