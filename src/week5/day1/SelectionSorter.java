package week5.day1;

import java.util.Arrays;
import java.util.Comparator;

public class SelectionSorter {

	public static void sort(int[] mas){
		//pivot 
		for(int j = 0; j < mas.length - 1; j++){
			int minI = j;
			
			// find min index
			for(int i = j + 1; i < mas.length; i++){
				if(mas[i] < mas[minI]){
					minI = i;
				}
			}
			
			// swap min element and pivot
			int temp = mas[j];
			mas[j] = mas[minI];
			mas[minI] = temp;
			
		}
	}
	
	public static void sortObj(Object[] arr, Comparator comparator){
		if(comparator == null){
			System.err.println("Comparator is null");
			return;
		}
		
		for(int j = 0; j < arr.length - 1; j++){
			int minI = j;
			
			// find min index
			for(int i = j + 1; i < arr.length; i++){
				if(comparator.compare(arr[minI], arr[i]) > 0){
					minI = i;
				}
			}
			
			// swap min element and pivot
			if(minI != j)
				swap(arr, j, minI);
			
		}
	}
	
	public static void swap(Object[] mas, int a, int b){
		Object temp = mas[a];
		mas[a] = mas[b];
		mas[b] = temp;
	}
	
	public static void main(String[] args) {
		
		int[] mas = {67,-3,68,-6,90};
		sort(mas);
		
		System.out.println(Arrays.toString(mas));
	}
	
}
