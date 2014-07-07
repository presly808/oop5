package week6.day2.linked;

import week5.day2.struct.IStack;

public class LinkedStack<E> implements IStack<E> {

	private Node top;

	// static class - nested
	// non-static - inner
	public class Node {
		
		Node next;
		E value;
		
		public Node(E value, Node next) {
			super();
			this.next = next;
			this.value = value;
		}
		
	}
		

	@Override
	public void push(E o) {
		if (top == null) {
			top = new Node(o, null);
		} else {
			Node newNode = new Node(o, top);
			top = newNode;
		}
	}


	@Override
	public E pop() {
		if (top == null) {
			System.out.println("Stack is empty");
			return null;
		} else {
			Node nodeForReturn = top;
			top = top.next;
			return nodeForReturn.value;
		}
	}

}
