public class FacadeClass {
	
	private Computer computer;
	private Dvd dvd;
	private Tv tv;
	
	public FacadeClass(Computer computer, Dvd dvd, Tv tv)
	{
		this.computer = computer;
		this.dvd = dvd;
		this.tv = tv;
	}
	
	public void performPower_On()    // performPower_On() includes (computer, dvd, tv)'s powerOn();
	{
		computer.powerOn();
		dvd.powerOn();
		tv.powerOn();
	}
	
	public void performPower_Off()     // performPower_Off() includes (computer, dvd, tv)'s powerOff();
	{
		computer.powerOff();
		dvd.powerOff();
		tv.powerOff();
	}
}
