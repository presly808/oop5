package week7.day2.serial;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSerial {

	private static final String PATH = 
			"e:\\dev\\workspace\\serialization_objects\\spider";
	
	public static void main(String[] args) {
		
		Spiderman spiderman = new Spiderman("Peter Parker", 150);
		Address address = new Address("New York", "Central Park");
		Girlfriend girlfriend = new Girlfriend(address, "Mary Jein Wathson");
		
		spiderman.setGirlfriend(girlfriend);
		spiderman.setAddress(address);
		
		MySerializer mySerializer = new MySerializer();
		
		mySerializer.serialize(spiderman, PATH);
		
		Spiderman deserializedSpider = (Spiderman) mySerializer.deserialize(PATH);
		
		System.out.println(deserializedSpider);
		
		
		
		
		
	}

}
