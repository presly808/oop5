package week5.day2.excep;

public class TestAtomic {
	public static void main(String[] args) {
		AtomicStation as = new AtomicStation(40);
		try {
			as.start(45);
		} catch (DangerSituationException e) {
			System.err.println(e.getMessage());
			as.saveAll();
		}
		System.out.println("Still working");
	}
}
