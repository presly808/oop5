package week5.day2.excep;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String pass = sc.next();
		while (true) {
			try {
				validate(pass);
				break;
			} catch (MyNumberFormatException m) {
				System.out.println("Invalid password\n Input again");
				pass = sc.next();
			}
		}
	}

	public static void validate(String pass) {
		// pass.toCharArray() => String - > char[]
		for (char c : pass.toCharArray()) {
			if (!(c > 47 && c < 58)) {
				throw new MyNumberFormatException("invalid format " + pass);
			}
		}
	}

}

class MyNumberFormatException extends RuntimeException {

	public MyNumberFormatException(String message) {
		super(message);
	}

}
