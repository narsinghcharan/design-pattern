package com.fdp.store;

import com.fdp.pizza.CheesePizza;
import com.fdp.pizza.ChickenPizza;
import com.fdp.pizza.IPizza;

public class PizzaStore {
	
	public IPizza orderPizza(String pizzaType) {
	
		IPizza p = null;
		
		if(pizzaType.equals("cheese")) {
			
			p = new CheesePizza();
		
		} else if(pizzaType.equals("chicken")) {
			
			p = new ChickenPizza();
		}
		
		p.prepare();
		p.bake();
		p.cut();
		
		return p;
	}
}
