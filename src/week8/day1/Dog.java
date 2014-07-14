package week8.day1;

public class Dog  implements Cloneable {
	
	private int age;
	private String name; // null
	private String flavor;
	private long deep;
	
	public Dog() {
		super();
	}

	public Dog(int age, String name, String flavor) {
		super();
		this.age = age;
		this.name = name;
		this.flavor = flavor;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	@Override
	public String toString() {
		return "Dog [age=" + age + ", name=" + name + ", flavor=" + flavor
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + (int) (deep ^ (deep >>> 32));
		result = prime * result + ((flavor == null) ? 0 : flavor.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Dog other = (Dog) obj;
		if (age != other.age)
			return false;
		if (deep != other.deep)
			return false;
		if (flavor == null) {
			if (other.flavor != null)
				return false;
		} else if (!flavor.equals(other.flavor))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		Dog dog = (Dog) super.clone();
		dog.flavor = new String(this.flavor); // this.flavor + "";
		dog.name = new String(this.name);
		return dog;
	}
	
	
	
	
	
	
}
