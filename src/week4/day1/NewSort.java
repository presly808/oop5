package week4.day1;

public class NewSort {
	
	public static void sort(Comparable[] mas){
		for(int j = 0; j < mas.length; j++){
			for(int i = 0; i < mas.length - 1; i++){
				if(mas[i].compareTo(mas[i+1]) > 0 ){
					swap(mas, i, i+1);
				}
			}
		}
		
	}	
	
	public static void swap(Object[] mas, int index1, int index2){
		Object temp = mas[index1];
		mas[index1] = mas[index2];
		mas[index2] = temp;
	}
	

}
