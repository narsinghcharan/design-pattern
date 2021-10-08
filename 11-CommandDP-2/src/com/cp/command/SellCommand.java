package com.cp.command;

import com.cp.receiver.StockExchange;

public class SellCommand implements Command {
	private String stockName;
	private int quantity;
	private StockExchange exchange;

	public SellCommand(StockExchange exchange) {
		this.exchange = exchange;
	}

	@Override
	public void execute() {
		exchange.sellStock(stockName, quantity);
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
