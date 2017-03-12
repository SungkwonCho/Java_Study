public class Computer implements Power{
	
	public String company;
	
	public Computer(String company)
	{
		this.company = company;
	}
	
	@Override
	public void powerOn()
	{
		System.out.println(company+"'s Computer is POWER-ON");
	}
	
	@Override
	public void powerOff()
	{
		System.out.println(company+"'s Computer is POWER-OFF");
	}
}
