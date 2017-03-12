import java.util.*;

public class AdapterTester {
	
	public static void main (String[] args)
	{
		ArrayList<Dog> dog_list = new ArrayList<Dog>();
		
		Dog jindoDog = new Jindo_dog("Zzanggu", "mong, mong");
		Cat munchkin = new Munchkin("Happy", "mew, mew");
		
		Dog adaptertoDog = new AdaptertoDog(munchkin);  // Change "munchkin" to Dog
		
		dog_list.add(jindoDog);
		dog_list.add(adaptertoDog);
		
		for(Dog dog: dog_list)
		{
			dog.speak();
			dog.jump();
			System.out.println();
		}
	}
}
