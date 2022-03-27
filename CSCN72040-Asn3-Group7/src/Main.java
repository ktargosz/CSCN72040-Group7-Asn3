// CSCN72040-Asn3-Group7
// Main.java

public class Main {

	public static void main(String[] args) {
		System.out.println("CSCN72040-Asn3");
		
		SimpleRemoteControl remoteControl = new SimpleRemoteControl();

		AirConditioner airConditioner = new AirConditioner();
		GarageDoor garageDoor = new GarageDoor();
		
		AirConditionerOnCommand airConditionerOnCommand = new AirConditionerOnCommand(airConditioner);
		AirConditionerOffCommand airConditionerOffCommand = new AirConditionerOffCommand(airConditioner);
		
		GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
		GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);
		
		// Set the buttons
		remoteControl.setCommand(airConditionerOnCommand, airConditionerOffCommand);
		
		// Press the buttons
		remoteControl.onButtonPressed();
		remoteControl.offButtonPressed();
		remoteControl.undoButtonPressed();
		
		// Set the buttons
		remoteControl.setCommand(garageDoorOpenCommand, garageDoorCloseCommand);
		
		// Press the buttons 
		remoteControl.onButtonPressed();
		remoteControl.offButtonPressed();
		remoteControl.undoButtonPressed();

		
	}
}