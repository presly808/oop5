package net.it_centre.week1.day2;

import java.util.Arrays;
import java.util.Scanner;

public class Task2Meth {
	// code assist Ctrl + Space
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input size of mas1");
		int size1 = sc.nextInt();

		System.out.println("Input size of mas2");
		int size2 = sc.nextInt();

		int[] mas1 = ArrayUtils.fillRandom(size1);
		ArrayUtils.printArr(mas1);

		int[] mas2 = ArrayUtils.fillRandom(size2);
		ArrayUtils.printArr(mas2);
		
		int[] resMas = ArrayUtils.mergeArrays(mas1, mas2);
		System.out.println("Merged arrays");
		ArrayUtils.printArr(resMas);
		
		

	}

}
