package week7.day2.serial;

import java.io.Serializable;

public class Girlfriend implements Serializable {
	
	private Address address;
	private String name;
	
	public Girlfriend(Address address, String name) {
		super();
		this.address = address;
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Girlfriend [address=" + address + ", name=" + name + "]";
	}
	
	
	
}
