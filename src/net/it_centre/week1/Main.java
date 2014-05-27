package net.it_centre.week1;

public class Main {
	
	public static void main(String[] args){
		// arrays
		int[] mas = new int[10]; // 34 0 0 0 0 0 0 0 0 0 
		mas[0] = 34;
		int el = mas[0];
		double[] mas1 = new double[12];
		
		// loops for, while, do - while
		for(int i = 0; i < mas.length; i++){
			mas[i] = i;
		}
		
		int i = 0;
		while(i < mas.length){
			System.out.println(i);
			i++;
		}
		
		int j = 9;
		do{
			System.out.println(j);
			j--;
		} while(j > 0);
		
		
		
	}
	
	
}
