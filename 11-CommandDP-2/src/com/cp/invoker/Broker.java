package com.cp.invoker;

import com.cp.command.Command;

public class Broker {
	public void receive(Command command) {
		command.execute();
	}
}
