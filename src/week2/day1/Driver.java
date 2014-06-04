package week2.day1;

public class Driver {
	
	private String name;
	private int experience;
	private Car car;
	
	//default constructor without args
	public Driver(){
		
	}
	
	//overloaded constructor
	public Driver(String name, int experience){
		this.name = name;
		this.experience = experience;
	}
	
	public void buyCar(Car newCar){
		car = newCar;
	}
	
	private void goFast(){
		car.drive(100);
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setExperience(int experience){
		this.experience = experience;
	}
	
	public int getExperience(){
		return experience;
	}
	
}
