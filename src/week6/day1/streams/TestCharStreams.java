package week6.day1.streams;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TestCharStreams {

	public static void main(String[] args) throws IOException {
		Reader reader = new FileReader("e:/22.txt"); 
		
		char[] buff = new char[1000]; 
		
		reader.read(buff);
		
		String res = new String(buff);
		
		System.out.println(res);
		
		
		
		
	}
}
