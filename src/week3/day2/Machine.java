package week3.day2;

public class Machine {
	
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
	
	
		
}
