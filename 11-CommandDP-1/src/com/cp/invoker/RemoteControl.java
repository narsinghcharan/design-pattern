package com.cp.invoker;

import com.cp.command.Command;

//invoker
public class RemoteControl {
	
	private Command command;
	
	public RemoteControl(Command command) {
		this.command = command;
	}
	
	public void pressButton() {
		command.execute();
	}
	
}

/*

RemoteControl is the invoker who can issue several commands (ie. can call execute() methods on 
several/different Command objects) and Command triggers an action (calls an method) on Receiver
who(Receiver) knows how to handle that action.

*/