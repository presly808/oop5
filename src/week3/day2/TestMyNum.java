package week3.day2;

public class TestMyNum {
	public static void main(String[] args) {
		MyNum n1 = new MyNum(45);
		MyNum n2 = new MyNum(15);
		
		MyNum res = n1.add(n2);
		
		System.out.println(res);
	}
}
