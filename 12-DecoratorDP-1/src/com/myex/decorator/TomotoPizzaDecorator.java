package com.myex.decorator;

import com.myex.base_object.Pizza;

public class TomotoPizzaDecorator extends PizzaDecorator{

	public TomotoPizzaDecorator(Pizza pizza){
		super(pizza);
	}
	
	@Override
	public void bake() {
		super.bake();
		addTomatoTpping();
	}
	
	public void addTomatoTpping() {
		System.out.println("Tomoto topping added...");
	}

}
