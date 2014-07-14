package week8.day1;

import week6.day2.linked.LinkedStack;

public class TestLinkedStackIter {

	public static void main(String[] args) {
		LinkedStack<String> linkedStack = new LinkedStack<String>();
		linkedStack.push("1");
		linkedStack.push("2");
		linkedStack.push("3");
		linkedStack.push("4");
		linkedStack.push("5");
		linkedStack.push("6");
		
		for(Object o : linkedStack){
			System.out.println(o);
		}
	}

}
