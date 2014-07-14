package week8.day1.clone;

import week8.day1.Dog;

public class TestClone {

	public static void main(String[] args) throws CloneNotSupportedException {
		Dog dog = new Dog(2, "Killer", "toyteryer");
		System.out.println("origin " + dog);
		Dog clonedDog = (Dog) dog.clone(); 
		System.out.println("clone " + clonedDog);
	}

}
