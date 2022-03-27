

// This is the invoker 
public class SimpleRemoteControl {
	
	// 2 Buttons
	Command onCommand;
	Command offCommand;
	Command lastCommand;
	
	
	public void setCommand(Command onCommand, Command offCommand){
        this.onCommand = onCommand;
        this.offCommand = offCommand;
    }
	
	public void onButtonPressed() {
		lastCommand = onCommand; 
		onCommand.execute(); 
	}
	
	public void offButtonPressed() {
		lastCommand = offCommand; 
		offCommand.execute(); 
	}
	
	public void undoButtonPressed() {
		lastCommand.undo();
	}
	
}
