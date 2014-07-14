package week5.day2.struct;

import java.util.Iterator;

public class MyStack<T> implements IStack<T>, Iterable<T> {

	private T[] mas;
	private int counter;//0, 1
	
	public MyStack(int size) {
		super();
		mas = (T[]) new Object[size];
	}

	@Override
	public void push(T o) {
		mas[counter++] = o;
	}

	@Override
	public T pop() {
		if(counter < 1){
			throw new EmptyStackException("Stack is empty");
		}
		T temp = mas[--counter];
		mas[counter] = null;
		return temp;
	}
	
	@Override
	public Iterator<T> iterator() {
		return null;
	}

	private class MyStackIterator implements Iterator<T> {

		int iterIndex = counter - 1;
		
		@Override
		public boolean hasNext() {
			return iterIndex >= 0;
		}

		@Override
		public T next() {
			return mas[iterIndex--];
		}

		@Override
		public void remove() {
			throw new UnsupportedOperationException();
		}
		
	}
	
	
}
