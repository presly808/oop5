package week7.day1.generics;

import week4.day1.interfaces.IWorker;
import week6.day2.decorator.Cherry;

//T,E,V,K
public class Pair<T extends Comparable, E> {

	private T first;
	private E second;
	
	public Pair() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pair(T first, E second) {
		super();
		this.first = first;
		this.second = second;
	}

	public T getFirst() {
		return first;
	}

	public void setFirst(T first) {
		this.first = first;
	}

	public E getSecond() {
		return second;
	}

	public void setSecond(E second) {
		this.second = second;
	}
	
	public void act(){
		
	}
		
}
