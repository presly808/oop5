package week2.day1;

public class Driver {
	
	String name;
	int experience;
	Car car;
	
	public void buyCar(Car newCar){
		car = newCar;
	}
	
	public void goFast(){
		car.drive(100);
	}
	
}
