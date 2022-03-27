

public class GarageDoorOpenCommand implements Command{

	GarageDoor garageDoor; 
	
	public GarageDoorOpenCommand(GarageDoor garage) {
		this.garageDoor = garage;
	}
	
	@Override
	public void execute() {
		garageDoor.open();
		
	}

	@Override
	public void undo() {
		garageDoor.close();
		
	}
	

}
