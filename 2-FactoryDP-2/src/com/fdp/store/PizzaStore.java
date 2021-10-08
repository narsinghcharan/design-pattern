package com.fdp.store;

import com.fdp.factory.PizzaFactory;
import com.fdp.pizza.IPizza;

public class PizzaStore {
	
	public IPizza orderPizza(String pizzaType) {
	
		IPizza p = null;
		
		p = PizzaFactory.createPizza(pizzaType);
		
		p.prepare();
		p.bake();
		p.cut();
		
		return p;
	}
}
