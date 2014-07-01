package week6.day2.decorator;

public abstract class Ingredient {
	
	private Ingredient wrapped;

	public Ingredient(Ingredient wrapped) {
		super();
		this.wrapped = wrapped;
	}
		
	public Ingredient getWrapped() {
		return wrapped;
	}

	public void setWrapped(Ingredient wrapped) {
		this.wrapped = wrapped;
	}

	public abstract double getPrice();
	
}
