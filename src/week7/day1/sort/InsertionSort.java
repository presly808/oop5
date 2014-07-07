package week7.day1.sort;

import java.util.Arrays;

public class InsertionSort {
	
	public static void sort(int[] mas){
		
		for(int i = 1; i < mas.length; i++){
			for(int j = i; j > 0 && mas[j] < mas[j-1]; j--){
				mas[j] = mas[j] ^ mas[j-1];
				mas[j-1] = mas[j] ^ mas[j-1];
				mas[j] = mas[j] ^ mas[j-1];
			}
		}
		
	}
	
	public static void main(String[] args) {
		double res = Math.pow(2, 30);
		System.out.println(res);
		int[] mas = {99,1,3,6,3,11,-6};
		sort(mas);
		int key = 11;
		int index = Arrays.binarySearch(mas, key);
		System.out.println(Arrays.toString(mas) + " index of " + key + "=" + index);
	}
	
}
