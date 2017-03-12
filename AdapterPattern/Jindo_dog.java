public class Jindo_dog implements Dog{
	
	private String name;
	private String voice;
	
	public Jindo_dog(String name, String voice)
	{
		this.name = name;
		this.voice = voice;
	}
	
	@Override
	public void speak()
	{
		System.out.println(name+"'s voice: "+voice);
	}
	
	@Override
	public void jump()
	{
		System.out.println(name+" can jump!");
	}
}
