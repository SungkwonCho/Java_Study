public class Toy {
	
	protected String name;
	protected int price;
	
	public String getName(){return name;}
	public int getPrice(){return price;}
	
	public void prepare()
	{
		System.out.println("[PREPARE] Toy name: "+name+", price: "+price);
	}
	
	public void Send()
	{
		System.out.println("[SEND] "+name);
	}
}
