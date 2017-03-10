public abstract class Store {
	
	private Toy toy;
	
	public abstract Toy CreateToy(String type);  // Create Toy through (String) type => Factory Method
	
	public void order(String type)   // Order Toy through type
	{
		toy = CreateToy(type);
		toy.prepare();
		toy.Send();
	}
}
