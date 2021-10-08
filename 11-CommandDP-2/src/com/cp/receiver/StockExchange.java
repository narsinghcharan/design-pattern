package com.cp.receiver;

public class StockExchange {
	public void buyStock(String stockName, int quantity) {
		System.out.println("received buy request for stock : " + stockName
				+ " for quantity : " + quantity);
	}

	public void sellStock(String stockName, int quantity) {
		System.out.println("received sell request for stock : " + stockName
				+ " for quantity : " + quantity);
	}
}
