package week4.day1;

import java.util.ArrayList;

import week2.day1.*;

public class GarageBasedOnArrayList {
	
	//default value null
	private ArrayList<Car> cars;
	
	public GarageBasedOnArrayList(int size){
		cars = new ArrayList<Car>(size);
	}
	
	public void addCar(Car car){
		cars.add(car);
	}
	
	public Car getLastCar(){
		
		return cars.get(cars.size() - 1);
	}
	
	public void removeLast(){
		cars.remove(cars.size() - 1);
	} 
	
	public Car getCar(int index){
		return cars.get(index);
	}
	
	public boolean hasMyCar(Car car){
		return cars.contains(car);
	}
	
	public void showAllCars(){
		for(Car c : cars){
			System.out.println(c);
		}
	}
	
}
