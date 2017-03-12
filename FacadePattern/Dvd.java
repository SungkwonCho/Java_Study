public class Dvd implements Power{
	
	public String company;
	
	public Dvd(String company)
	{
		this.company = company;
	}
	
	@Override
	public void powerOn()
	{
		System.out.println(company+"'s Dvd is POWER-ON");
	}
	
	@Override
	public void powerOff()
	{
		System.out.println(company+"'s Dvd is POWER-OFF");
	}
}
