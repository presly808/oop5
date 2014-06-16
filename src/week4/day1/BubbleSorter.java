package week4.day1;

import java.util.Arrays;

public class BubbleSorter {

	public static void sort(int[] mas){
		for(int j = 0; j < mas.length; j++){
			for(int i = 0; i < mas.length - 1; i++){
				if(mas[i] > mas[i+1]){
					swap(mas, i, i+1);
				}
			}
		}
		
	}
	
	public static void swap(int[] mas, int index1, int index2){
		int temp = mas[index1];
		mas[index1] = mas[index2];
		mas[index2] = temp;
	}
	
	
	
	public static void main(String[] args) {
		int[] mas = {56,12,88,-4,2,1,566};
		
		System.out.println(Arrays.toString(mas));
		
		sort(mas);
		
		System.out.println(Arrays.toString(mas));
		
		
	}
	
}
