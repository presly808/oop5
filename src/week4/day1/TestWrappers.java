package week4.day1;

import java.lang.*;

public class TestWrappers {

	public static void main(String[] args) {
		Integer i = new Integer(56);
		
		System.out.println(i.compareTo(56));
		
		int val = Integer.parseInt("ass");
		System.out.println(val);
		int val1 = Integer.valueOf("123");
		
		Integer val3 = 67; // Integer <- int - Autoboxing
		int val4 = val3; // int <- Integer  Unboxing
		
		
		Character c = 's'; // new Character('c');
		
		String s = "some";// 
		
		
		
		
		
	}

}
