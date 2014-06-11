package week3.day1;

public class TestWorkerEquals {

	public static void main(String[] args) {
		Worker w1 = new Worker("Kolia", 25, 1200);
		Worker w2 = new Worker("Kolia", 25, 1200);
		Worker w3 = new Worker("Kolia", 25, 1200);
		
		
		if(w1.equals(w1)){
			System.out.println("Reflectivity");
		}
		
		if(w1.equals(w2) && w2.equals(w1)){
			System.out.println("Symmetry");
		}
		
		if(w1.equals(w2) && w2.equals(w3) && w1.equals(w3)){
			System.out.println("Transitivity");
		}
		
		System.out.println("w1.equals(w2) " + w1.equals(w2));
		System.out.println("w1 == w2 " + (w1 == w2));
		
		// Ctrl + Shift + T 
	}

}
