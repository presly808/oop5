package week8.day1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

import week2.day1.Student;

public class TestHashStruct {

	public static void main(String[] args) {
		Dog dog1 = new Dog(2, "Sharik", "dvorniaga");
		Dog dog2 = new Dog(5, "Jack", "buldog");
		Dog dog3 = new Dog(6, "Rex", "ovcharka");
		
		Dog dog4 = new Dog(7, "Dina", "kavkaz");
		Dog dog5 = new Dog(5, "Nicka", "terier");
		
		HashSet set = new HashSet();
		set.add(dog1);
		set.add(dog2);
		set.add(dog3);
		set.add(dog4);
		set.add(dog5);
		
		
		
		Iterator iter = set.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(56, "Oleg");
		String value = map.get(56);
		for(Integer key : map.keySet()){
			System.out.println(map.get(key));
		}
		
		
		
		
		
	}

}
