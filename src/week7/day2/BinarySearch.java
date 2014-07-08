package week7.day2;

import java.util.Arrays;

public class BinarySearch {
	 
	
	public static int binarySearch(int[] mas, int key){
		
		int start = 0;
		int end = mas.length - 1;
		
		while(start <= end){
			int mid = start + (end - start) / 2;
			
			if(key < mas[mid]){
				end = mid - 1;
			} else if(key > mas[mid]){
				start = mid + 1;
			} else {
				return mid;
			}
		}
		
		return -1; //can not find element
		
	}
	
	public static int binarySearchRec(int[] mas, int key, int start, int end ){

		if(start > end){
			return -1;
		}
		
			int mid = start + (end - start) / 2;
			
			if(key < mas[mid]){
				end = mid - 1;
			} else if(key > mas[mid]){
				start = mid + 1;
			} else {
				return mid;
			}
		
		return binarySearchRec(mas, key, start, end); //can not find element
		
	}
	
	public static void main(String[] args) {
		int[] mas = {1,2,3,4,5,6,7,8,9,10,11,12};
		Arrays.binarySearch(mas, 7);
		int index = binarySearchRec(mas, 3, 0, mas.length -1);
		System.out.println(index);
	}
	
}	
