package week3.day1;

public class Tester extends Worker {
	
	private String type;
	
	public Tester() {
		
	}

	public void test(){
		System.out.println("Testing some...");
	}
	
	public void foo(){
		super.setAge(22);
	}
	
}
