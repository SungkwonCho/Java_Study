public class RemoteController {
	
	Command[][] command = new Command[2][4];
	Command uncommand = new noCommand();
	
	public RemoteController()
	{
		Command nocommand = new noCommand();
		for(int i=0;i<command.length;i++)
			for(int j=0;j<command[i].length;j++)
			{
				command[i][j] = nocommand;
			}
		uncommand = nocommand;
	}
	
	public void Car_setButton(int index, Command command)
	{
		this.command[0][index] = command;
	}
	
	public void Airplane_setButton(int index, Command command)
	{
		this.command[1][index] = command;
	}
	
	public void Car_buttonClick(int index)
	{
		this.command[0][index].execute();
		uncommand = this.command[0][index];
	}
	
	public void Airplane_buttonClick(int index)
	{
		this.command[1][index].execute();
		uncommand = this.command[1][index];
	}
	
	public void undoButtonClick()
	{
		uncommand.undo();
	}
}
