package com.fdp.pizza;

public class CheesePizza implements IPizza {

	@Override
	public void prepare() {
		System.out.println("Preparing CheesePizza Pizza ...");
	}

	@Override
	public void bake() {
		System.out.println("Baking CheesePizza Pizza ...");
	}

	@Override
	public void cut() {
		System.out.println("Cutting CheesePizza Pizza ...");
	}

}
