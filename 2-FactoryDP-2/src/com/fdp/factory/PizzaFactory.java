package com.fdp.factory;

import com.fdp.pizza.CheesePizza;
import com.fdp.pizza.ChickenPizza;
import com.fdp.pizza.IPizza;

public class PizzaFactory {

	public static IPizza createPizza(String pizzaType) {
		
		IPizza p = null;
		
		if(pizzaType.equals("cheese")) {
			
			p = new CheesePizza();
		} else if(pizzaType.equals("chicken")) {
			
			p = new ChickenPizza();
		}
		
		return p;
	}
}
