package week2.day1;

public class TestStudent {

	public static void main(String[] args) {
		// Scanner , String? Student
		Student s = new Student(); // create
		// init
		s.age = 25;
		s.name = "Anton";
		s.groupNum = 34;

		s.sayHello();
		
		Student s2 = s;
		s2.sayHello();
	}

}
