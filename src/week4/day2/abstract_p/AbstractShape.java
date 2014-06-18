package week4.day2.abstract_p;

public abstract class AbstractShape {
	
	private String name;
	private String color;
	
	public AbstractShape(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "AbstractShape [name=" + name + ", color=" + color + "]";
	}
	
	public abstract double square();
	
}	
