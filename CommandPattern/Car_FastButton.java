public class Car_FastButton implements Command{
	
	private Car car;
	
	public Car_FastButton(Car car)
	{
		this.car = car;
	}
	
	@Override
	public void execute()
	{
		car.setFAST();
		System.out.println(car);
	}
	
	@Override
	public void undo()
	{
		car.setNORMAL();
		System.out.println(car);
	}
}
