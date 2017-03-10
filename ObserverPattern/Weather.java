import java.util.ArrayList;

public class Weather implements Observerble{
	private float pressure;
	private float humidity;
	private float temperature;
	private ArrayList observerArray;
	
	
	public Weather()  //Weather Class 초기화
	{
		observerArray = new ArrayList();
	}
	
	@Override
	public void RegisterObserver(Observer observer)   //Observer Register
	{
		observerArray.add(observer);
	}
	
	@Override
	public void RemoveObserver(Observer observer)    // Observer Remove
	{
		int index = observerArray.indexOf(observer);
		if(index > 0)
			observerArray.remove(index);
	}
	
	@Override
	public void NotifyObserver()         // Notify to Observers
	{
		for(int i=0;i<observerArray.size();i++)
		{
			Observer observer = (Observer)observerArray.get(i);
			observer.Update(pressure, humidity, temperature);
		}
	}
	
	public void MeasureChange(float pressure, float humidity, float temperature)   //맴버 값 바뀔 시 호출
	{
		setMeasure(pressure, humidity, temperature);
		NotifyObserver();
	}
	
	public void setMeasure(float pressure, float humidity, float temperature)   // Member Value's Setter
	{
		this.pressure = pressure;
		this.humidity = humidity;
		this.temperature = temperature;
	}
}
