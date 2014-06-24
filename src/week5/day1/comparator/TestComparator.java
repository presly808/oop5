package week5.day1.comparator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import week5.day1.SelectionSorter;

public class TestComparator {

	public static void main(String[] args) throws ParseException {
		Client[] clients = new Client[4];
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		clients[0] = new Client("Vova", sdf.parse("15/03/1990"));
		clients[1] = new Client("Alex", sdf.parse("12/03/1985"));
		clients[2] = new Client("Serg", sdf.parse("11/02/1985"));
		clients[3] = new Client("Nika", sdf.parse("16/01/1966"));
		
		NullPointerException npe = new NullPointerException();
		
		System.out.println(Arrays.toString(clients));
		ClientNameComparator com = new ClientNameComparator();
		
		//Arrays.sort(clients, com);
		
		SelectionSorter.sortObj(clients, null);		
		System.out.println(Arrays.toString(clients));
	}
}
