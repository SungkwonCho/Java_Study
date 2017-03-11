public class CarFactory {           // Factory Pattern for Car-Class

	private Car car;
	
	public CarFactory()
	{
		car = new Car("HyunDae", Car.STOP);
	}
	
	public Command CreateButton(String type)
	{
		Command command = null;
		if(type.equals("fast"))
			command = new Car_FastButton(car);
		else if(type.equals("normal"))
			command = new Car_NormalButton(car);
		else if(type.equals("low"))
			command = new Car_LowButton(car);
		else
			command = new Car_StopButton(car);
		
		return command;

	}
}