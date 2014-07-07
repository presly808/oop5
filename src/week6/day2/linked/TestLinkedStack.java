package week6.day2.linked;

import week6.day2.decorator.Cherry;

public class TestLinkedStack {

	public static void main(String[] args) {

		LinkedStack<Cherry> ls = new LinkedStack<Cherry>();

		System.out.println(ls.pop());
		System.out.println(ls.pop());
		System.out.println(ls.pop());
		System.out.println(ls.pop());

		sortStack(ls);

	}

	public static void sortStack(LinkedStack<? extends Comparable> linkedStack) {

	}

	public static<T extends Comparable> void sortStackGen(LinkedStack<T> linkedStack) {

	}
	
}
