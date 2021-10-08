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
Here client can not create the object of Computer class without using Builder class also.

*/