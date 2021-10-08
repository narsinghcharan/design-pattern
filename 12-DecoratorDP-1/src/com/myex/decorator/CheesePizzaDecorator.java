package com.myex.decorator;

import com.myex.base_object.Pizza;

public class CheesePizzaDecorator extends PizzaDecorator {

	public CheesePizzaDecorator(Pizza pizza){
		super(pizza);
	}
	
	@Override
	public void bake() {
		super.bake();
		addCheeseTpping();
	}
	
	public void addCheeseTpping() {
		System.out.println("Cheese topping added...");
	}

}
