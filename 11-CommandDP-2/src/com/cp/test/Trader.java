package com.cp.test;

import com.cp.receiver.StockExchange;
import com.cp.command.BuyCommand;
import com.cp.command.Command;
import com.cp.invoker.Broker;

public class Trader {
	public static void main(String[] args) {
		Broker broker = null;
		Command command = null;
		StockExchange exchange = null;

		exchange = new StockExchange();		//first of all Receiver will be there.

		command = new BuyCommand(exchange);	//then Command will be created and receiver will be injected into command.
		
		broker = new Broker();	//now Invoker will be created.

		//now we will prepare our command object and pass this command object to invoker then
		//using invoker, the Person(Trader) will give command(instruction) to Receiver.
		((BuyCommand) command).setStockName("cipla");
		((BuyCommand) command).setQuantity(35);

		broker.receive(command);
	}
}
