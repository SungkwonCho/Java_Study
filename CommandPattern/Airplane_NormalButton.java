public class Airplane_NormalButton implements Command{
	
	private Airplane airplane;
	
	public Airplane_NormalButton(Airplane airplane)
	{
		this.airplane = airplane;
	}
	
	@Override
	public void execute()
	{
		airplane.setNORMAL();
		System.out.println(airplane);
	}
	
	@Override
	public void undo()
	{
		airplane.setLOW();
		System.out.println(airplane);
	}
}
