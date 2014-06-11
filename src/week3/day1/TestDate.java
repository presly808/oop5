package week3.day1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TestDate {

	public static void main(String[] args) throws ParseException {
		Date date = new Date();
		
		System.out.println(date.getTime());

		System.out.println(date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy:MM:dd HH:mm"); 
		Date parsedDateFromString = sdf.parse("2000:05:12 12:12");
		
		System.out.println(parsedDateFromString);
		
		String stringFromDate = sdf.format(parsedDateFromString);
		System.out.println(stringFromDate);
		
		
	}

}
