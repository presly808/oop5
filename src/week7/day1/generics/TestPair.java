package week7.day1.generics;

import week6.day2.decorator.Cherry;

public class TestPair {

	// 1. Runtime exceptions replaced by compilation 
	// 2. Type safety
	public static void main(String[] args) {
		Pair<String, Integer> pair = new Pair<String, Integer>();
		
		pair.setFirst("one");
		pair.setSecond(2);
		
		String s1 = pair.getFirst();
		
		
		Pair pair2 = new Pair();
		pair2.setFirst(45);
		pair2.setSecond("asda");
		
		String s = (String) pair2.getFirst();
	}

}
