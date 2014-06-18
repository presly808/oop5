package week4.day2.final_w;

public final class AtomicStation { // Can not extend from class

	public static final String FINAL_VARIABLE_FOR_STATION = "Name";
	
	private final double temperature; 
	
	public AtomicStation(double temperature){
		this.temperature = temperature;
	}
	
	public final void start(){
		System.out.println("Starting station");
	}

	
}
