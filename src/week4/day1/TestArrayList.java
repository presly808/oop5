package week4.day1;

import java.util.ArrayList;

import week3.day2.Machine;

public class TestArrayList {

	public static void main(String[] args) {
		ArrayList arrList = new ArrayList(); // Object [] mas
		arrList.add("String");// mas[i] = "String" 
		arrList.add(new Machine(200,"M")); 
		Object o = arrList.get(0); // Object o = mas[0]
		
		arrList.set(2, o);
		
		arrList.size();
		
		//Using generic
		ArrayList<String> list = new ArrayList<String>();
		

	}

}
