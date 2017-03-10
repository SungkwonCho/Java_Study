public class MainPage {
	
	public static void main(String[] args)
	{
		Character archer = new archer();  // Case 1: My Charater : archer
		
		archer.performAttack();
		archer.performJump();
		
		Character auger = new auger();  // Case 2: My Charater : auger
		
		auger.performAttack();
		auger.performJump();
		
	    Character sordier = new Sordier();   // Case 3: My Charater : sordier
		
	    sordier.performAttack();
	    sordier.performJump();
	}
}
