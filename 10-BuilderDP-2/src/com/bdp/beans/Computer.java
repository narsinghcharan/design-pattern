package com.bdp.beans;

import com.bdp.builder.ComputerBuilder;

public class Computer {

	//required parameters
	private String ram;
	private String hdd;
	private String cpu;
	
	//optional parameters
	private boolean isGraphicsCardEnabled;
	private boolean isBluetoothEnabled;
	
	public Computer(ComputerBuilder builder) {
		this.ram = builder.getRam();
		this.hdd = builder.getHdd();
		this.cpu = builder.getCpu();
		this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled();
		this.isBluetoothEnabled = builder.isBluetoothEnabled();
	}

	@Override
	public String toString() {
		return "Computer [ram=" + ram + ", hdd=" + hdd + ", cpu=" + cpu + ", isGraphicsCardEnabled="
				+ isGraphicsCardEnabled + ", isBluetoothEnabled=" + isBluetoothEnabled + "]";
	}
}

/*

Now here until we create the builder class object we can't create Computer class object because 
in the Computer class constructor we have to pass builder class object.

as we can  see that no one can create the object of Computer class directly without using 
ComputerBuilder class, then why we have declared Computer class constructor as 'public'.

if we declare Computer class as private then we can't create object of Computer class in 
ComputerBuilder class.

so what is the solution for this?
we will write this builder class as static nested class inside Computer class.
check in next program.

anyhow this application is also correct.
*/
