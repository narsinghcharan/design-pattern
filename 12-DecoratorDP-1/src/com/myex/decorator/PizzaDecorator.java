package com.myex.decorator;

import com.myex.base_object.Pizza;

public abstract class PizzaDecorator implements Pizza{

	private Pizza pizza;
	
	public PizzaDecorator(Pizza pizza) {
		
		this.pizza = pizza;
	}
	
	@Override
	public void bake() {

		pizza.bake();
	}

}
