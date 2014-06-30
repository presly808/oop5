package week6.day1.streams;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FileReaderApp {
	
	
	public static String readFromFile(String path){
		File file = new File(path);
		String res = "";
		
		if(!file.exists()){
			System.out.println("File doesn't exist");
			return null;
		}
		
		try {
			Scanner fileScanner = new Scanner(file);
			while(fileScanner.hasNextLine()){
				res += fileScanner.nextLine() + "\n";
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return res;
	}
}
