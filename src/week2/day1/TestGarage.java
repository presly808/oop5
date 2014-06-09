package week2.day1;

public class TestGarage {

	public static void main(String[] args) {
		Garage garage = new Garage(10);
		Car car = new Car("subaru", 2000, "B", 2000);
		Car car1 = new Car("subaru", 2000, "B", 2000);
		Car car2 = new Car("subaru", 2000, "B", 2000);
		Car car3 = new Car("subaru", 2000, "B", 2000);
		
		
		garage.addCar(car);
		garage.addCar(car1);
		garage.addCar(car2);
		garage.addCar(car3);
		
		garage.getLastCar();
		garage.getLastCar();
		garage.getLastCar();
		garage.getLastCar();
		
		
	}

}
