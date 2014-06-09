package week2.day1;

public class Garage {
	
	//default value null
	private Car[] cars;
	private int parkingPlace = 0;
	
	public Garage(int size){
		cars = new Car[size];
	}
	
	public void addCar(Car car){
		cars[parkingPlace] = car;
		parkingPlace++;
	}
	
	public Car getLastCar(){
		parkingPlace--;
		Car last = cars[parkingPlace];
		cars[parkingPlace] = null;
		return last;
	}
	
	
	
	public void showAllCars(){
		
	}
	
}
