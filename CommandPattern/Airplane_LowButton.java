public class Airplane_LowButton implements Command{
	
	private Airplane airplane;
	
	public Airplane_LowButton(Airplane airplane)
	{
		this.airplane = airplane;
	}
	
	@Override
	public void execute()
	{
		airplane.setLOW();
		System.out.println(airplane);
	}
	
	@Override
	public void undo()
	{
		airplane.setSTOP();
		System.out.println(airplane);
	}
}
