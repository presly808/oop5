package week4.day2.final_w;

import week4.day2.abstract_p.Circle;

public final class ImmutableClass {
	
	private final int value = 78;
	private final Circle circle = new Circle("circle", "red", 34);
	
	public int getValue(){
		return value;
	}
	
}
