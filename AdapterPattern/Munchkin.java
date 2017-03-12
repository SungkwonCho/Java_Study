public class Munchkin implements Cat{
	
	private String name;
	private String talk;
	
	public Munchkin(String name, String talk)
	{
		this.name = name;
		this.talk = talk;
	}
	
	@Override
	public void talk()
	{
		System.out.println(name+"'s voice: "+talk);
	}
	
	@Override
	public void bounce()
	{
		System.out.println(name+" can't jump!");
	}
}
