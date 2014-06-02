package week2.day1;

public class TestCar {
	
	public static void main(String[] args) {
		Car subaru = new Car();
		subaru.model = "subaru";
		subaru.weight = 2000.0;
		
		subaru.fix();
		subaru.drive(100);
		
		Car opel = new Car();
		opel.model = "opel";
		opel.drive(12);
		
		Driver d = new Driver();
		d.experience = 12;
		d.name = "Crazy";
		
		d.buyCar(subaru);
		d.car.fix();
		
		
		
	}
	
}
