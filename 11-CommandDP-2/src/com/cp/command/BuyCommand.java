package com.cp.command;

import com.cp.receiver.StockExchange;

public class BuyCommand implements Command {
	private String stockName;
	private int quantity;
	private StockExchange exchange;

	public BuyCommand(String stockName, int quantity, StockExchange exchange) {
		super();
		this.stockName = stockName;
		this.quantity = quantity;
		this.exchange = exchange;
	}

	public BuyCommand(StockExchange exchange) {
		this.exchange = exchange;
	}

	@Override
	public void execute() {
		exchange.buyStock(stockName, quantity);
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
