package week2.home;

// Shift + Alt + S - Generate
// Shift + Alt + R - Rename
public class Time {
	
	private int hours;
	private int minutes;
	
	public Time(int hours, int minutes) {
		this.hours = hours;
		this.minutes = minutes;
	}

	public int getHours() {
		return hours;
	}
	
	public void setHours(int hours) {
		this.hours = hours;
	}
	
	public int getMinutes() {
		return minutes;
	}
	
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	
	public void showTime(){
		System.out.println(hours + " : " + minutes);
	}
}
