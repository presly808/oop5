package week6.day2.decorator;

public class Chocolate extends Ingredient {

	public Chocolate(Ingredient wrapped) {
		super(wrapped);
	}

	@Override
	public double getPrice() {
		return 0.90 + (getWrapped() != null ? getWrapped().getPrice() : 0);
	}
	
}
