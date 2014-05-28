package net.it_centre.week1.day2;

// printArr
public class ArrayUtils {
	/*
	 * 1. What have to do 
	 * 2. Input data (arguments) 
	 * 3. Output data (return type)
	 */

	public static void printArr(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
		System.out.println(); // new line action
	}
	
	// Math.random(); 0,12346569882 * 10 = 1,234
	public static int[] fillRandom(int size){
		int[] mas = new int[size];
		
		for (int i = 0; i < mas.length; i++) {
			mas[i] = (int)(Math.random() * 10);
		}
		
		return mas;
	}
	
	public static int[] mergeArrays(int[] mas1, int[] mas2){
		int[] res = new int[mas1.length + mas2.length];
		
		int i = 0;
		int j = 0;
		while(i < res.length){
			if(i < mas1.length) {
				res[i] = mas1[i];
			} else {
				res[i] = mas2[j];
				j++;
			}
			i++;
		}
		
		return res;
	}
	
}
