import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cat extends Animal
{
	public Cat()
	{
		super();
	}
	
	@Override
	public void running()
	{
		System.out.println(getClass().getName() + " is running in park");
	}
	
	@Override
	public boolean Hoop()                      // Additional Question : Cat want to drink water ?
	{
		String result = getAnswer();
		if(result.toLowerCase().startsWith("y"))
			return true;
		else
			return false;
	}
	
	public String getAnswer()    // Input Question's Answer & return answer's value
	{
		String answer = null;
		System.out.print("You want to drink water ? ");
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		try{
			answer = input.readLine();
		}catch(IOException e){System.err.println("IOException ");}
		return answer;
	}
	
	@Override
	public void a_Action()       // If, Hoop() == true  -->  a_Action() LOAD
	{
		System.out.println("Here you are~~");
	}
}