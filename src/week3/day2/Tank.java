package week3.day2;

public class Tank extends Machine {
	
	private String weapon;
	
	//syso + Ctrl + Space
	public void go(){
		System.out.println("Tank is moving");
	}

	@Override
	public String toString() {
		return "weapon : " + weapon + " model : " + getModel();
	}
	
}
