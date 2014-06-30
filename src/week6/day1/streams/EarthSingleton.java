package week6.day1.streams;


//Not Lazy Singleton
public class EarthSingleton {
	
	private static EarthSingleton INSTANCE = new EarthSingleton();
	
	private EarthSingleton(){}
	
	public static EarthSingleton getInstance(){
		return INSTANCE;
	}
	
}

//
class EarthLazySingleton{
	private static EarthLazySingleton INSTANCE = null;
	
	private EarthLazySingleton(){}
	
	public static EarthLazySingleton getInstance(){
		if(INSTANCE == null){
			INSTANCE = new EarthLazySingleton();
		}
		return INSTANCE;
	}
}
