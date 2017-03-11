public class commandTester {
	
	public static void main(String[] args)
	{
		CarFactory carFactory = new CarFactory();
		AirplaneFactory airplaneFactory = new AirplaneFactory();
		
		RemoteController controller = new RemoteController();

		///////////////////////////////////////////////////////////////////
		
		// Setting RemoteController Button[0][i]   (using Factory Pattern)
		controller.Car_setButton(0, carFactory.CreateButton("stop"));
		controller.Car_setButton(1, carFactory.CreateButton("low"));
		controller.Car_setButton(2, carFactory.CreateButton("normal"));
		controller.Car_setButton(3, carFactory.CreateButton("fast"));

		// Setting RemoteController Button[1][j]   (using Factory Pattern)
		controller.Airplane_setButton(0, airplaneFactory.CreateButton("stop"));
		controller.Airplane_setButton(1, airplaneFactory.CreateButton("low"));
		controller.Airplane_setButton(2, airplaneFactory.CreateButton("normal"));
		controller.Airplane_setButton(3, airplaneFactory.CreateButton("fast"));

		//////////////////////////////////////////////////////////////////////////
		
		// When user button Clicked 
		controller.Car_buttonClick(3);
		controller.Car_buttonClick(0);
		controller.undoButtonClick();              // reverse button
		
		controller.Airplane_buttonClick(1);
		controller.Airplane_buttonClick(2);
		controller.undoButtonClick();             // reverse button
		
		return;
	}
}
