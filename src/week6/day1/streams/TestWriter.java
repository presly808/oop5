package week6.day1.streams;

import java.io.FileWriter;
import java.io.IOException;

public class TestWriter {

	public static void main(String[] args) {
		String seq = "новий ssssтекст для запису";
		
		FileWriter fw = null;
		try {
			fw = new FileWriter("e:/22.txt");
			fw.write(seq);
			fw.flush();
		} catch (IOException e){
			e.printStackTrace();
		} finally {
			try {
				if(fw != null){
					fw.close();					
				}
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
		
		
		System.out.println("after writing");

	}
}


