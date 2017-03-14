import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dog extends Animal{
	
	public Dog()
	{
		super();
	}
	
	@Override
	public void running()
	{
		System.out.println(getClass().getName()+" is running in his home.");
	}
	
	/*
	 * I'll not override Hoop() method. So, it's method will operate in Super-Class(Animal)'s Hoop()
	 */
}
