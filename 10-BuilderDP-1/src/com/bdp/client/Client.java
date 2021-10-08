package com.bdp.client;

import com.bdp.beans.Computer;
import com.bdp.builder.ComputerBuilder;

public class Client {

	public static void main(String[] args) {
		
/*		ComputerBuilder builder = new ComputerBuilder().cpu("i7").ram("32").hdd("2TB");
		
		Computer computer = builder.build();
		
		System.out.println(computer);
*/
/*
		ComputerBuilder builder = new ComputerBuilder().cpu("i7").ram("32").hdd("2TB").isGraphicsCardEnabled(true).isBluetoothEnabled(true);
		
		Computer computer = builder.build();
		
		System.out.println(computer);
*/
		//or
		Computer computer = new ComputerBuilder().cpu("i7").ram("32").hdd("2TB").isGraphicsCardEnabled(true).isBluetoothEnabled(true).build();
		
		System.out.println(computer);
		
		
		
	}
}

/*
Here the problem is, client can create the object of Computer class without using Builder class also.

actually it is not a problem it may depends on our requirement.

Now I will write such a code where for creating Computer class object we have to create builder class object. 

suppose out requirement is to create object using builder only, then checkout the next program.

*/