
public class TemperatureDevice implements Observer, Display{
	
	private float temperature;
	private Weather weather;
	
	public TemperatureDevice(Weather weather)
	{
		this.weather = weather;
		weather.RegisterObserver(this);    // Register myself to Observable;
	}
	
	@Override
	public void Update(float pressure, float humidity, float temperature)
	{
		this.temperature = temperature;
	}
	
	@Override
	public void display()
	{
		System.out.println("TemperatureDevice's temperature : " + temperature);
	}
}
