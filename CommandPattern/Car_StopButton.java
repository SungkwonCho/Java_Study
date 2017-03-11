public class Car_StopButton implements Command{
	
	private Car car;
	
	public Car_StopButton(Car car)
	{
		this.car = car;
	}
	
	@Override
	public void execute()
	{
		car.setSTOP();
		System.out.println(car);
	}
	
	@Override
	public void undo()
	{
		car.setLOW();
		System.out.println(car);
	}
}
