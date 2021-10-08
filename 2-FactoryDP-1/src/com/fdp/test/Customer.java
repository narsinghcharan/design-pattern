package com.fdp.test;

import com.fdp.store.PizzaStore;

public class Customer {

	public static void main(String[] args) {
		
		PizzaStore ps = new PizzaStore();
		
		ps.orderPizza("cheese");
	}
}

/*
Here we have not used any factory DP.

1) here the problem is when demands will be more for other types of pizza then we need to 
modify the code in PizzaStore in orderPizza() method.

2) the other problem is, PizzaStore must have to know the Pizza implementation class to 
create the object.

3) if other class also wants to create Pizza then he also write the above piece of logic.

That's where factory came into picture.


*/