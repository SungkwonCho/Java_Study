public class HumidityDevice implements Observer, Display
{
	private Weather weather;
	private float humidity;
	
	public HumidityDevice(Weather weather)
	{
		this.weather = weather;
		weather.RegisterObserver(this);  // Register myself to Observable;
	}
	
	@Override
	public void Update(float pressure, float humidity, float temperature)
	{
		this.humidity = humidity;  
	}
	
	@Override
	public void display()
	{
		System.out.println("HumidityDevice's humidity : "+humidity);
	}
}
