public class AirplaneFactory {           // Factory Pattern for Airplane-Class

	private Airplane airplane;
	
	public AirplaneFactory()
	{
		airplane = new Airplane("Asiana", Airplane.STOP);

	}

	public Command CreateButton(String type)
	{
		Command command = null;
		if(type.equals("fast"))
			command = new Airplane_FastButton(airplane);
		else if(type.equals("normal"))
			command = new Airplane_NormalButton(airplane);
		else if(type.equals("low"))
			command = new Airplane_LowButton(airplane);
		else
			command = new Airplane_StopButton(airplane);
		
		return command;
	}
}