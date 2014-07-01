package week6.day2.linked;

public class TestLinkedStack {

	public static void main(String[] args) {
		
		LinkedStack ls = new LinkedStack();
		
		ls.push("Andrey");
		ls.push("Anton");
		ls.push("Bogdan");
		ls.push("Victoria");
		
		System.out.println(ls.pop());
		System.out.println(ls.pop());
		System.out.println(ls.pop());
		System.out.println(ls.pop());
		
	}

}
