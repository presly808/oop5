package week4.day2.java_sort;

import java.util.Arrays;

import week3.day2.Machine;
import week4.day1.NewSort;

public class TestSort {

	public static void main(String[] args) {
		int[] mas = {1,67,-12,33,87,22};
		
		Machine[] machines = new Machine[10];
		
		
		for(int i = 0; i < machines.length; i++){
			machines[i] = new Machine(Math.random() * 1000, "model - " + i);
			
		}
		
		System.out.println(Arrays.toString(machines));
		
		// Arrays.sort(machines);
		NewSort.sort(machines);
		
		
		System.out.println(Arrays.toString(machines));
	}

}
