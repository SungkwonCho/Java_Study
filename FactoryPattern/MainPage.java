public class MainPage {
	
	public static void main(String[] args)
	{
		Store skStore = new SKStore();    // If you want to buy Toy from SKstore
		
		skStore.order("Bear");            // Buy BearToy in SKstore
		
		System.out.println();
		
		Store ssStore = new SSStore();   // If you want to buy Toy from SSstore
		ssStore.order("Robot");          // Buy BearToy in SSstore
	}
}
