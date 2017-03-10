public class archer extends Character {
	
	public archer()           // archer's weapon is arrow, archer can jump
	{
		weapon = new Arrow();
		jump = new HasJump();
	}
}
