

public class GarageDoorCloseCommand implements Command{

	GarageDoor garageDoor; 
	
	public GarageDoorCloseCommand(GarageDoor garage) {
		this.garageDoor = garage;
	}
	
	@Override
	public void execute() {
		garageDoor.close();
		
	}

	@Override
	public void undo() {
		garageDoor.open();
		
	}
}
