package week2.day1;

import net.it_centre.week1.day2.ArrayUtils;

public class Week1Methods {

	
	public static boolean isSimple(int num){
		boolean simple = true;
		for(int n = num - 1; n > 1; n--){
			if(num % n == 0) {
				System.out.print(n + " ");
				simple = false;
			}
		}
		return simple;
	}
	
	public static int countTrico(int[] mas){
		int trico = 0;
		for(int i = 0; i < mas.length; i++){
			if(mas[i] % 2 == 0) {
				trico++;
			}
		}
		return trico;
	}
	
	public static void main(String[] args) {
		int[] mas1 = ArrayUtils.fillRandom(10);
		ArrayUtils.printArr(mas1);
		int[] mas2 = ArrayUtils.fillRandom(10);
		ArrayUtils.printArr(mas2);
		
		int tricoMas1 = countTrico(mas1);
		int tricoMas2 = countTrico(mas2);
		
		if(tricoMas1 > tricoMas2){
			System.out.println("mas1 tricoAmount = " + tricoMas1);
		} else {
			System.out.println("mas2 tricoAmount = " + tricoMas2);
		}
		
		System.out.println(isSimple(12342));
	}
}
