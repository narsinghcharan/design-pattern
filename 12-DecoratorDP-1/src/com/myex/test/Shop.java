package com.myex.test;

import com.myex.base_object.NormalPizza;
import com.myex.base_object.Pizza;
import com.myex.decorator.CheesePizzaDecorator;

public class Shop {

	public static void main(String[] args) {
		
		Pizza pizza = null;
		
		pizza = new CheesePizzaDecorator(new NormalPizza());
		pizza.bake();
		
		System.out.println("-----------------------");
		
		pizza = new CheesePizzaDecorator(new NormalPizza());
		pizza.bake();
		
	}
}
