package week6.day2.linked;

public class TestInnerNested {

	public static void main(String[] args) {
		
		LinkedStack stack = new LinkedStack();
		
		LinkedStack.Node node = stack.new Node("text", null);
		//LinkedStack.Node node = new LinkedStack.Node("text", null);
	}

}
