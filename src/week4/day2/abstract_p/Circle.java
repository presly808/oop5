package week4.day2.abstract_p;

public class Circle extends AbstractShape{
	
	private double radius;	

	public Circle(String name, String color, double radius) {
		super(name, color);
		this.radius = radius;
	}

	@Override
	public double square() {
		return Math.pow(radius, 2) * Math.PI;
	}
	
}	
