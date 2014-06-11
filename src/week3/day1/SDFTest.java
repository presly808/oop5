package week3.day1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SDFTest {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		String pattern = "MM:dd:yyyy";
		
		System.out.println("Input date ex: " + pattern);
		String input = sc.nextLine();
		
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
		// String -> Date
		Date date = sdf.parse(input);
		
		//change pattern
		sdf.applyPattern("yyyy/MM/dd");
		
		String res = sdf.format(date);
		
		System.out.println(res);
	}

}
