package com.fdp.pizza;

public class ChickenPizza implements IPizza {

	@Override
	public void prepare() {
		System.out.println("Preparing Chicken Pizza ...");
	}

	@Override
	public void bake() {
		System.out.println("Baking Chicken Pizza ...");
	}

	@Override
	public void cut() {
		System.out.println("Cutting Chicken Pizza ...");
	}
}
