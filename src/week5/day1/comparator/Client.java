package week5.day1.comparator;

import java.util.Date;

public class Client {
	
	private String name;
	private Date birthsday;
	
	public Client(String name, Date birthsday) {
		super();
		this.name = name;
		this.birthsday = birthsday;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Date getBirthsday() {
		return birthsday;
	}
	
	public void setBirthsday(Date birthsday) {
		this.birthsday = birthsday;
	}

	@Override
	public String toString() {
		return "Client [name=" + name + ", birthsday=" + birthsday + "]";
	}
	
	
	
	
}
