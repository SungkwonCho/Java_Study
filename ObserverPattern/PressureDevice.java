public class PressureDevice implements Observer, Display 
{
	private float pressure;
	private Weather weather;
	
	public PressureDevice(Weather weather)
	{
		this.weather = weather;
		weather.RegisterObserver(this);   // Register myself to Observable;
	}
	
	@Override
	public void Update(float pressure, float humidity, float temperature)
	{
		this.pressure = pressure;
	}
	
	@Override
	public void display()
	{
		System.out.println("PressureDevice's pressure : "+pressure);
	}
}
