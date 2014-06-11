package week3.day2;

public class MyNum {
	
	private double value;

	public MyNum(double value) {
		this.value = value;
	}
	
	public MyNum add(MyNum other){
		double res = this.value + other.value;
		return new MyNum(res);
	}
	
	
}
