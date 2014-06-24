package week5.day2.excep;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestExc {

	public static void main(String[] args) {
		
		System.out.println("after parse");
		// try - catch
		try {
			a();	
			System.out.println("after a()");
		} catch(ParseException e) {
			System.out.println("In catch excep");
			//e.printStackTrace();
		}
		System.out.println("After catch");
	}

	public static void a() throws ParseException {
		System.out.println("In a");
		b();
		System.out.println("after b()");
	}

	public static void b() throws ParseException {
		System.out.println("In b");
		c();
		System.out.println("after c()");
	}

	public static void c() throws ParseException {
		System.out.println("in c");
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.parse("aa/12/1467");
		throw new NullPointerException();
	}
}
