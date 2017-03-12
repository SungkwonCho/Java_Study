public class Tv implements Power{
	
	public String company;
	
	public Tv(String company)
	{
		this.company = company;
	}
	
	@Override
	public void powerOn()
	{
		System.out.println(company+"'s Tv is POWER-ON");
	}
	
	@Override
	public void powerOff()
	{
		System.out.println(company+"'s Tv is POWER-OFF");
	}
}
