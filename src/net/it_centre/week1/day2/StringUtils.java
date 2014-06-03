package net.it_centre.week1.day2;

public class StringUtils {
	
	public static String swapMinMaxWord(String seq){
		String[] words = seq.split(" ");
		
		int minIndex = 0;
		String minWord = words[0];
		
		int maxIndex = 0;
		String maxWord = words[0];
		
		for(int i = 0; i < words.length; i++){
			//find min
			if(minWord.length() > words[i].length()){
				minWord = words[i];
				minIndex = i;
			}
			//find max
			if(maxWord.length() < words[i].length()){
				maxWord = words[i];
				maxIndex = i;
			}
		}
		
		//swapping
		words[minIndex] = maxWord;
		words[maxIndex] = minWord;
		
		return convert(words);
	}
	
	public static String convert(String[] seq){
		String res = "";
		for(int i = 0; i < seq.length; i++){
			res += seq[i] + " ";
		}
		return res;
	}
	
}	
