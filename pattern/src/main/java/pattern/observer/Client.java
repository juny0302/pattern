package pattern.observer;

public class Client {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		GeneralDisplay generalDisplay = new GeneralDisplay(weatherData);
		
		weatherData.setMeasurement(80, 64, 30.5f);
		weatherData.removeObserver(generalDisplay);
		
		weatherData.setMeasurement(70, 57, 31.6f);
		weatherData.setMeasurement(70, 57, 31.6f);
		weatherData.setMeasurement(70, 57, 31.6f);
		//test aaa bbbbb
		
	}
}
