package pattern.observer;

public class GeneralDisplay  implements ObserverI {
	

	public GeneralDisplay(SubjectI subject) {
		subject.registerObserver(this);
	}

	public void update(float temp,float humidity,float pressure) {
		System.out.println(String.format("温度：%s,湿度：%s，气压：%s",temp,humidity,pressure));
	}

}
