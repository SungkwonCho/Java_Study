public class SKStore extends Store{
	
	@Override
	public Toy CreateToy(String type)       //SKStore's Factory Method
	{
		if(type.equals("Bear"))            // If type = "Bear" -> return SKBearToy
			return new SKBearToy();
		else if(type.equals("Robot"))      // If type = "Robot" -> return SKRobotToy
			return new SKRobotToy();
		else
			return null;                   // else return null
	}
}
