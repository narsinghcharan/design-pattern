package com.fdp.test;

import com.fdp.store.PizzaStore;

public class Customer {

	public static void main(String[] args) {
		
		PizzaStore ps = new PizzaStore();
		
		ps.orderPizza("cheese");
	}
}

/*


Note :- There is nothing call factory DP or Simple Factory DP, it is also called simple factory DP.

Point to remember :-

factory class method should be static so without creating the factory class object we can 
call its method.

factory class method may return its own class object or any other class object.



*/