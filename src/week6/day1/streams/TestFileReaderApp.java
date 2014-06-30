package week6.day1.streams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestFileReaderApp {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
								new InputStreamReader(
											System.in));

		
		System.out.println("Input file path");
		String path = br.readLine();
		
		String res = FileReaderApp.readFromFile(path);
		System.out.println(res);
	}

}
