public class Car_NormalButton implements Command{
	
	private Car car;
	
	public Car_NormalButton(Car car)
	{
		this.car = car;
	}
	
	@Override
	public void execute()
	{
		car.setNORMAL();
		System.out.println(car);
	}
	
	@Override
	public void undo()
	{
		car.setLOW();
		System.out.println(car);
	}
}
