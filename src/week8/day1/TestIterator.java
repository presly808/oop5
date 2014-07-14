package week8.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestIterator {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Kolia", "Serhii", "Andrey");
		Iterator<String> iter = list.iterator();
		
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		
		System.out.println("***************************");
		for(String s : list){
			System.out.println(s);
		}
		
		
		
		
		//ArrayList<String> list1 = new ArrayList<>();
	}

}
