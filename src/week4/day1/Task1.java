package week4.day1;

import java.util.Arrays;

import week3.day2.Machine;

public class Task1 {

	public static void main(String[] args) {
		
		Machine[] garage = new Machine[6];
		
		int[] mas = {1,2,3,4,5,6,7,8};
		
		for(int i = 0; i < garage.length; i++){
			garage[i] = new Machine(2000, "A");
		}
		
		
		//for each 
		for(Machine mach : garage){
			System.out.println(mach);
		}
		
		System.out.println("***************");
		String res = Arrays.toString(garage);
		System.out.println(res);
		
	}

}
