package week7.day2.serial;

import java.io.Serializable;

public class Spiderman implements Serializable {
	
	private String name;
	private int speed;
	private transient Address address;
	private Girlfriend girlfriend;
	
	public Spiderman(String name, int speed) {
		super();
		this.name = name;
		this.speed = speed;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Girlfriend getGirlfriend() {
		return girlfriend;
	}

	public void setGirlfriend(Girlfriend girlfriend) {
		this.girlfriend = girlfriend;
	}

	@Override
	public String toString() {
		return "Spiderman [name=" + name + ", speed=" + speed + "]";
	}
	
		
}
