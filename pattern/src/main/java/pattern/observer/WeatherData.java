package pattern.observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WeatherData implements SubjectI {
	float temp;
	float humidity;
	float pressure;
	
	private List<ObserverI> list = new ArrayList<ObserverI>();

	public void registerObserver(ObserverI observer) {
		list.add(observer);

	}

	public void removeObserver(ObserverI observer) {
		list.remove(observer);

	}

	public void notifyObserver() {
	 	Iterator<ObserverI> iterator = list.iterator();
	 	while(iterator.hasNext()){
	 		iterator.next().update(temp, humidity, pressure);
	 	}
	}
	
    public void setMeasurement(float temp,float humidity,float pressure){
    	this.temp = temp;
    	this.humidity = humidity;
    	this.pressure = pressure;
    	notifyObserver();
    }

}
