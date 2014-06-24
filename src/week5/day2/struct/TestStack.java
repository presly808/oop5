package week5.day2.struct;

public class TestStack {
	
	public static void main(String[] args) {
		IStack stack = new MyStack(10);
		
		stack.push("LINE1");
		stack.push("LINE2");
		stack.push("LINE3");
		stack.push("LINE4");
		stack.push("LINE5");
		stack.push("LINE6");
		
		System.out.println("*********");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
	}
}
