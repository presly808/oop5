package week3.day2;

public class Machine implements Comparable {
	
	private double weight;
	
	private String model;
	
	
	
	public Machine() {
		super();
	}

	public Machine(double weight, String model) {
		super();
		this.weight = weight;
		this.model = model;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void go(){
		System.out.println("Machine is moving");
	}

	@Override
	public String toString() {
		return "Machine [weight=" + weight + ", model=" + model + "]";
	}

	@Override
	public int compareTo(Object o) {
		Machine m = (Machine) o;
		
		// example ternary by using if - else statement
		/*if(this.weight < m.weight) {
			return -1;
		} else if(this.weight > m.weight){
			return 1;
 		} else {
 			return 0;
 		}*/
		
		//ternary operator
		return this.weight < m.weight ? -1 : this.weight > m.weight ? 1 : 0;
	}
	
	
		
}
