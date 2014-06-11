package week2.home;

public class Date {
	
	private int year;
	private int month;
	private int day;
	private Time time; //
	
	
	public Date(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public int getMonth() {
		return month;
	}


	public void setMonth(int month) {
		this.month = month;
	}


	public int getDay() {
		return day;
	}


	public void setDay(int day) {
		this.day = day;
	}


	public Time getTime() {
		return time;
	}


	public void setTime(Time time) {
		this.time = time;
	}
	
	public void showDate(){
		System.out.println(year + " : " + month + " : " + day);
		time.showTime(); //null.showTime();
	}
	
}
