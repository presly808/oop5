package week4.day1.interfaces;

public class TestInterf {

	public static void main(String[] args) {
		
		
		Student student = new Student();
		Imusician mus  = student;
		for (int i=0; i < 6; i++) {
			mus.play(20);
			System.out.println("go to concert " + mus.goToConcert());
		}
		
	}
	
	public static void companySecure(IWorker worker){
		worker.work();
	}
	
	public static void univercitySecure(IStudent student){
		student.study();
	}

}
