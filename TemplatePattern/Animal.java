public abstract class Animal {
	
	public void Action()    // Basic Argolithm
	{
		prepare();
		running();
		Jumping();
		if(Hoop())
			a_Action();
	}
	
	public abstract void running();   // You need to make method's body in Sub-Class
	
	public void prepare()
	{
		System.out.println(getClass().getName()+" is preparing to go outside.");
	}
	
	public void Jumping()
	{
		System.out.println(getClass().getName() + "is jumping !");
	}
	
	public boolean Hoop(){return false;}   // hoop Method <- If, want to make order, Add method's body in Sub-Class
	public void a_Action(){} // If you want to make additional action, Add method's body in Sub-Class
	
	
}
