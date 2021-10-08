package com.cp.command;

import com.cp.receiver.Television;

//Command class, encapsulated with Receiver to perform action (call method on Receiver)
public class PowerOnCommand implements Command {

	private Television television;		//Receiver class declared as attribute

	public PowerOnCommand(Television television) {
		this.television = television;
	}

	@Override
	public void execute() {
		television.on();
	}
}
