package com.cp.client;

import com.cp.command.Command;
import com.cp.command.PowerOffCommand;
import com.cp.command.PowerOnCommand;
import com.cp.invoker.RemoteControl;
import com.cp.receiver.Television;

public class Person {

	public static void main(String[] args) {
		Person person = new Person();
		person.perform();

	}

	public void perform() {
		//receiver
		Television television = new Television();
		
		//command
		Command command1 = new PowerOnCommand(television);
		
		//invoker (issue switch on command for television )
		RemoteControl remoteControl1 = new RemoteControl(command1);
		remoteControl1.pressButton();

		//----------------------------------------------------------
		
		//command
		Command command2 = new PowerOffCommand(television);

		//invoker (issue switch off command for television )
		RemoteControl remoteControl2 = new RemoteControl(command2);
		remoteControl2.pressButton();
		
	}
}
/*

here ultimately Invoker wants to call Receiver. so in this way we do it :-

invoker calls -> Command class method -> command class calls Receiver 

so first of all we create Receiver object and inject into Command class while creating command
class object.

then we inject command class object into invoker class while creating invoker class object.

Typically in command design pattern there are 5 actors involved :-

1) Command :-

2) Client :- (Person class)

3) Invoker :-

4) Concrete Command :-

5) Receiver :-

*/