package week6.day2.decorator;

public class Icecream {

	private Ingredient chain; 
	
	private final double price;

	public Icecream(double price, Ingredient chain) {
		super();
		this.chain = chain;
		this.price = price;
	}
	
	public double getFullPrice(){
		return price + (chain != null ? chain.getPrice() : 0);
	}
	
}
