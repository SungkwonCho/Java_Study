public class Airplane_FastButton implements Command{    
	
	private Airplane airplane;
	
	public Airplane_FastButton(Airplane airplane)
	{
		this.airplane = airplane;
	}
	
	@Override
	public void execute()
	{
		airplane.setFAST();
		System.out.println(airplane);
	}
	
	@Override
	public void undo()
	{
		airplane.setNORMAL();
		System.out.println(airplane);
	}
}
