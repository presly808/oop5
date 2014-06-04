package week2.day1;

//Ctrl + Space 
public class TestCar {
	
	public static void main(String[] args) {
		Car subaru = new Car("subaru",2000, "black", 1500);
		
		subaru.fix();
		subaru.drive(100);
		
		Car opel = new Car("opel", 2009,"red", 3000);
		opel.drive(12);
		
		Driver d = new Driver("Crazy", 12);
		d.setName("Vova"); //d.name = "Vova"; was replaced by setter method 
		
		System.out.println(d.getName()); //System.out.println(d.name);
		
		d.buyCar(subaru);
		
	
		
		
	}
	
}
