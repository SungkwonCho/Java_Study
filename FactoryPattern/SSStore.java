public class SSStore extends Store{

	@Override
	public Toy CreateToy(String type)       //SKStore's Factory Method
	{
		if(type.equals("Bear"))            // If type = "Bear" -> return SSBearToy
			return new SSBearToy();
		else if(type.equals("Robot"))      // If type = "Robot" -> return SSRobotToy
			return new SSRobotToy();
		else
			return null;                   // else return null
	}
}
