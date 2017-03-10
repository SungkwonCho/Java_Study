public class Main {
	
	public static void main(String[] args)
	{
		Weather weather = new Weather();
		TemperatureDevice Device_temperature = new TemperatureDevice(weather);  //Register to Weather
		HumidityDevice Device_humidity = new HumidityDevice(weather);  // Register to Weather
		PressureDevice Device_pressure = new PressureDevice(weather);  // Register to Weather
		
		weather.MeasureChange(30, 20, 33); //Change Value (P:30, H:20, T:33)
		
		Device_pressure.display();
		Device_humidity.display();
		Device_temperature.display();
		
		////////////////////////////////////////////////////////////////////////////////////////////////
		
		System.out.println();
		weather.RemoveObserver(Device_pressure);  //Remove Observer(Device_pressure)
		
		weather.MeasureChange(10, 50, 82); //Change Value (P:30, H:20, T:33)
		
		Device_pressure.display();  // Not Change
		Device_humidity.display();
		Device_temperature.display();
		
		///////////////////////////////////////////////////////////////////////////////////////////////
		
		System.out.println();
		weather.RegisterObserver(Device_pressure);
		
        weather.MeasureChange(100, 100, 100); //Change Value (P:30, H:20, T:33)
		
		Device_pressure.display();  //Change Again
		Device_humidity.display();
		Device_temperature.display();
	}
}
