public class Car_LowButton implements Command{
	
	private Car car;
	
	public Car_LowButton(Car car)
	{
		this.car = car;
	}
	
	@Override
	public void execute()
	{
		car.setLOW();
		System.out.println(car);
	}
	
	@Override
	public void undo()
	{
		car.setSTOP();
		System.out.println(car);
	}
}
