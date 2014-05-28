package net.it_centre.week1.day2;
// task1. Merge two arrays 
public class Task1 {
	// Ctrl + Shift + F
	public static void main(String[] args) {
		int[] mas1 = { 1, 2, 3, 4, 5, 6 };// 

		int[] mas2 = { 34, 12, 345, 66, 23, 12, 545, 65 };

		int[] res = new int[mas1.length + mas2.length];
		
		
		
		for(int i = 0, k = 0, j = 0; k < res.length; k++, i++){
			if(i < mas1.length){
				res[k] = mas1[i];
			} else {
				res[k] = mas2[j];
				j++;
			}
			
		}
		
		for(int i = 0; i < res.length; i++){
			System.out.print(res[i] + " ");
		}
		
	}

}
