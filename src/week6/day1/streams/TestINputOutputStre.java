package week6.day1.streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class TestINputOutputStre {

	private static final String PATH = "e:/1.txt";
	
	public static void main(String[] args) throws Exception {
		String line = "Привіт) Файле)";
		
		OutputStream os = new FileOutputStream(PATH);
		for(char c : line.toCharArray()){
			os.write(c);
		}
		
		System.out.println("After writing");
	}

}
