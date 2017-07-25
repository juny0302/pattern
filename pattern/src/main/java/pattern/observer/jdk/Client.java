package pattern.observer.jdk;

public class Client {
	
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		
		weatherData.addObserver(new GeneralDisplay());
		
		weatherData.setMeasurement(70, 57, 31.5f);

	}
}
