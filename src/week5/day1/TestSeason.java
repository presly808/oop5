package week5.day1;

public class TestSeason {

	public static void main(String[] args) {
		Season winter = Season.valueOf("WINTER");
		System.out.println(winter.getDays());
		
		Season[] seasons = Season.values();
		
		for(Season s : seasons){
			System.out.println(s);
		}

		System.out.println(winter.toString());
		System.out.println(winter.name());
		System.out.println(winter.ordinal());
	}
}
