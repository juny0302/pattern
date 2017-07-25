package pattern.observer.jdk;

import java.util.Observable;
import java.util.Observer;

public class GeneralDisplay implements Observer {

	public void update(Observable arg0, Object arg1) {
		if (arg0 instanceof WeatherData) {
			WeatherData weatherData = (WeatherData)arg0;
			
			System.out.println(String.format("温度：%s,湿度：%s，气压：%s",
					weatherData.getTemp(),weatherData.getHumidity(),weatherData.getPressure()));
		}

	}

}
