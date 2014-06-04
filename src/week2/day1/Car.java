package week2.day1;

public class Car {

	String model = "Unknown";
	int year = 2000;
	String color = "black";
	double weight;
	boolean fixed;

	public Car(String model, int year, String color, double weight){
		this.model = model;
		this.year = year;
		this.color = color;
		this.weight = weight;
	}
	
	public void drive(int speed) {
		if (!fixed) {
			System.out.println("Car is broken");
		} else if (speed > 110) {
			System.out.println("It is too fast for you");
		} else {
			System.out.println("Let's go! Crazy driver");
		}
	}
	
	public void showState(){
		System.out.println("Car is fixed = " + fixed);
	}
	
	public void fix(){
		fixed = true;
	}


}
