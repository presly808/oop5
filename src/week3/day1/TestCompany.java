package week3.day1;

public class TestCompany {

	public static void main(String[] args) {
		Tester t = new Tester();
		t.setAge(22);
		t.setFullname("Vasia");
		t.setSalary(1200);
		
		System.out.println(t);
		
		Programer p = new Programer();
		Worker w = new Worker("Kolia", 26, 1200);
		
		
		Worker w1 = new Tester();
		showFullName(p);
		showFullName(t);
		showFullName(w);
		
		
		
	}
	
	public static void showFullName(Worker w){
		System.out.println(w.getFullname());
	}

}
