package week5.day1;

public enum Season {
	
	//create instances
	WINTER("winter", 30, -22), SPRING("spring", 90, 20), 
	SUMMER("summer", 120, 30), AUTUMN("fall", 50, 10);
	
	final private String name;
	final private int days;
	final private double temperature;
	
	
	private Season(String name, int days, double temperature) {
		this.name = name;
		this.days = days;
		this.temperature = temperature;
	}


	public int getDays() {
		return days;
	}
	
	
	
	
	
}
//static final Season WINTER = new Season("WINTER");
// 