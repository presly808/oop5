package week3.day2;

public class TestOverriding {

	public static void main(String[] args) {// TODO Auto-generated method stub

		Machine m = new Machine();
		m.go();
		
		Tank t = new Tank();
		t.setModel("T-34");
		t.setWeight(10000);
		t.go();
		
		Tank t1 = new Tank();
		t.setModel("T-34");
		t.setWeight(10000);

	
		Machine m2 = new Tank();
		m2.go();
		
		

	}

}
