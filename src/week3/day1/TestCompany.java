package week3.day1;

public class TestCompany {

	public static void main(String[] args) {
		Tester t = new Tester();
		Programer p = new Programer();
		Worker w = new Worker("Kolia", 26, 1200);
		
		
		Worker w1 = new Tester();
		action(p);
		action(t);
		action(w);
		
		
		
	}
	
	public static void action(Worker w){
		w.setAge(22);
	}

}
