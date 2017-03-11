public class Airplane {
	
	private String name;
	private int speed;
	
	public static final int FAST = 3;
	public static final int NORMAL = 2;
	public static final int LOW = 1;
	public static final int STOP = 0;
	
	public Airplane(String name, int speed)
	{
		this.name = name;
		this.speed = speed;
	}
	
	public void setName(String name){this.name = name;}
	
	public void setFAST(){this.speed = FAST;}
	public void setNORMAL(){this.speed = NORMAL;}
	public void setLOW(){this.speed = LOW;}
	public void setSTOP(){this.speed = STOP;}
	
	@Override
	public String toString()
	{
		return "Aireplane Name: "+name+", Speed: "+speed;
	}
}
