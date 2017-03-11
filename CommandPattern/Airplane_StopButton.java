public class Airplane_StopButton implements Command{
	
	private Airplane airplane;
	
	public Airplane_StopButton(Airplane airplane)
	{
		this.airplane = airplane;
	}
	
	@Override
	public void execute()
	{
		airplane.setSTOP();
		System.out.println(airplane);
	}
	
	@Override
	public void undo()
	{
		airplane.setLOW();
		System.out.println(airplane);
	}
}
