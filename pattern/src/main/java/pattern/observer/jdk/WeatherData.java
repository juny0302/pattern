package pattern.observer.jdk;

import java.util.Observable;

public class WeatherData extends Observable {
	float temp;
	float humidity;
	float pressure;
	public float getTemp() {
		return temp;
	}
	public void setTemp(float temp) {
		this.temp = temp;
	}
	public float getHumidity() {
		return humidity;
	}
	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}
	public float getPressure() {
		return pressure;
	}
	public void setPressure(float pressure) {
		this.pressure = pressure;
	}
	
	public void measurementsChanged(){
		setChanged();
		notifyObservers();
	}
    public void setMeasurement(float temp,float humidity,float pressure){
    	this.temp = temp;
    	this.humidity = humidity;
    	this.pressure = pressure;
    	measurementsChanged();
    }
}
