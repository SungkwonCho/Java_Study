public class auger extends Character{
	
	public auger()   // auger's weapon is Axe, auger can't jump
	{
		weapon = new Axe();
		jump = new NotJump();
	}
}
