package com.bdp.builder;

import com.bdp.beans.Computer;

public class ComputerBuilder {

	//required parameters
	private String ram;
	private String hdd;
	private String cpu;
	
	//optional parameters
	private boolean isGraphicsCardEnabled;
	private boolean isBluetoothEnabled;
	
	public ComputerBuilder ram(String ram) {
		this.ram = ram;
		return this;
	}
	public ComputerBuilder hdd(String hdd) {
		this.hdd = hdd;
		return this;
	}
	public ComputerBuilder cpu(String cpu) {
		this.cpu = cpu;
		return this;
	}
	public ComputerBuilder isGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
		this.isGraphicsCardEnabled = isGraphicsCardEnabled;
		return this;
	}
	public ComputerBuilder isBluetoothEnabled(boolean isBluetoothEnabled) {
		this.isBluetoothEnabled = isBluetoothEnabled;
		return this;
	}
	
	// we need to access this builder class attributes in Computer class so w have to write getter methods for all attributes 
	public String getRam() {
		return ram;
	}
	public String getHdd() {
		return hdd;
	}
	public String getCpu() {
		return cpu;
	}
	public boolean isGraphicsCardEnabled() {
		return isGraphicsCardEnabled;
	}
	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}
	
	//builder method which is responsible for creating the object and initiating the bean and returning that object to us.
	public Computer build() {
		if(ram == null) {
			throw new IllegalStateException("Missing RAM");
		}
		if(hdd == null) {
			throw new IllegalStateException("Missing Hard Disk Drive");
		}
		if(cpu == null) {
			throw new IllegalStateException("Missing CPU");
		}
		//no need to check for 'isGraphicsCardEnabled' and 'isBluetoothEnabled' because these are optional
		
		return new Computer(this);
		
	}
}

/*

Reference :- 
https://www.youtube.com/watch?v=mFCk31FoUg4

objective of builder class :-
create class object + initialize that object + return that class object to user/client.
*/
