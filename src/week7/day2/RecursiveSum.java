package week7.day2;

public class RecursiveSum {
	
	public static int recSum(int num){
		
		if(num == 0){
			return 0; // mod = 0
		} 
		
		int mod  = num % 10;
		
		int returned = recSum(num /= 10);  // step action - recursion
		
		return mod + returned;
	}
	
	public static void main(String[] args) {
		int res = recSum(12345);
		System.out.println(res);
		
	}
}
