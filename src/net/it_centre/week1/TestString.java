package net.it_centre.week1;

public class TestString {

	public static void main(String[] args) {
		String s = "some line";
		s.toCharArray();
		s = s + 78 + 12;
		
		char[] word = {'s','o','m','e'};
		
		System.out.println(s);
		
		sum(45, 12, s);

	}
	
	public static void sum(int a, int b, String ss){
		System.out.println(ss);
		int c = a + b;
		
	}
	
	

}
