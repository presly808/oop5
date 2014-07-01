package week6;

public class StringBuilderTest {
	
	public static void main(String[] args) {
		String s = "";
		
		long start = System.currentTimeMillis();
		for(int i = 0; i < 100000; i++){
			s += "1";
		}
		System.out.println(System.currentTimeMillis() - start);
		
		start = System.currentTimeMillis();
		StringBuilder builder = new StringBuilder();
		for(int i = 0; i < 100000000; i++){
			builder.append("1");
		}
		String res = builder.toString();
		System.out.println(System.currentTimeMillis() - start);
		//System.out.println(s);
		
	}
	
}
