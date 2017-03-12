public class AdaptertoDog implements Dog         // Change Cat to Dog
{
	private Cat cat;
	
	public AdaptertoDog(Cat cat)
	{
		this.cat = cat;
	}
	
	@Override
	public void speak()           // Cat's method "talk" -> Dog's method "speak"
	{
		cat.talk();
	}
	
	@Override
	public void jump()            // Cat's method "bounce" -> Dog's method "jump"
	{
		cat.bounce();
	}
}

