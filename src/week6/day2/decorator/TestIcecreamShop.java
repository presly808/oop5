package week6.day2.decorator;

public class TestIcecreamShop {

	public static void main(String[] args) {
		Icecream icecream = new Icecream(10, 
								new Cherry(3.0, 2, 
										new Chocolate(
												new Cherry(5.0, 1, null))));
		System.out.println(icecream.getFullPrice());
	}

}
