package week4.day2.abstract_p;

public class TestShape {
	
	
	public static void main(String[] args) {
		Circle circle = new Circle("circle", "red", 24);
		getSquareFromShape(circle);
	}
	
	public static double getSquareFromShape(AbstractShape shape){
		return shape.square();
	}
}
