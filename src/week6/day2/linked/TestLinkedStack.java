package week6.day2.linked;

import week6.day2.decorator.Cherry;

public class TestLinkedStack {

	public static void main(String[] args) {

		LinkedStack<String> ls = new LinkedStack<String>();

		ls.push("Vania");
		ls.push("Kolia");
		ls.push("Alisa");
		ls.push("Inna");

		sortStack(ls);
		
		System.out.println(ls.pop());
		System.out.println(ls.pop());
		System.out.println(ls.pop());
		System.out.println(ls.pop());


	}

	public static void sortStack(LinkedStack<? extends Comparable> linkedStack) {

	}

	public static<T extends Comparable> void sortStackGen(LinkedStack<T> linkedStack) {

	}
	
}
