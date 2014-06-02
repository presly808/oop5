package week2.day1;

import java.util.Scanner;

public class TestStudentsGroup {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input group size");
		int groupSize = sc.nextInt();
		
		// int[] mas = new int[10]; 
		// String[] mas = new String[10];
		Student[] students = new Student[groupSize];
		
		
		for(int i = 0; i < students.length; i++){
			Student stud = new Student();
			
			System.out.println("Input name");
			stud.name = sc.next();
			
			System.out.println("Input age");
			stud.age = sc.nextInt();
			
			System.out.println("Input group");
			stud.groupNum = sc.nextInt();
			
			students[i] = stud;
		}
		
		
		
		for(int i = 0; i < students.length; i++){
			students[i].sayHello();
			
		}
		
	}

}
