public abstract class Character {
	
	Jump jump;       // Relation of has-A
	Weapon weapon;   // Relation of has-A
	
	
	public void performJump()
	{
		jump.JumpMotion();
	}
	
	public void performAttack()
	{
		weapon.attack();
	}
}
