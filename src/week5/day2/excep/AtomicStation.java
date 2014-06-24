package week5.day2.excep;

public class AtomicStation {
	
	private double temperature;
	
	public AtomicStation(double temperature) {
		super();
		this.temperature = temperature;
	}

	public void start(double temp) throws DangerSituationException{
		if(temp > temperature){
			throw new DangerSituationException("Alarm!!!");
		}
	}
	
	public void saveAll(){
		System.out.println("Saving all people");
	}
}
