package week6.day2.decorator;

public class Cherry extends Ingredient {
	
	private double price;
	private int count;
		
	public Cherry(double price, int count, Ingredient wrapped) {
		super(wrapped);
		
		this.price = price;
		this.count = count;
	}

	@Override
	public double getPrice() {
		return price * count + (getWrapped() != null ? getWrapped().getPrice() : 0);
	}
		
}
