public class FacadeTester {

	public static void main(String[] args)
	{
		Computer computer = new Computer("Samsung");
		Tv tv = new Tv("LG");
		Dvd dvd = new Dvd("SK");
		
		FacadeClass facade = new FacadeClass(computer, dvd, tv);
		
		facade.performPower_On();   // call computer, dvd, tv's powerOn method
		
		System.out.println();
		
		facade.performPower_Off();  // call computer, dvd, tv's powerOff method
	}
}
