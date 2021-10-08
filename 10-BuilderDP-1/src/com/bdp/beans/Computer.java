package com.bdp.beans;

public class Computer {


	//required parameters
	private String ram;
	private String hdd;
	private String cpu;
	
	//optional parameters
	private boolean isGraphicsCardEnabled;
	private boolean isBluetoothEnabled;
	
	public Computer(String ram, String hdd, String cpu, boolean isGraphicsCardEnabled, boolean isBluetoothEnabled) {
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
		this.isGraphicsCardEnabled = isGraphicsCardEnabled;
		this.isBluetoothEnabled = isBluetoothEnabled;
	}

	@Override
	public String toString() {
		return "Computer [ram=" + ram + ", hdd=" + hdd + ", cpu=" + cpu + ", isGraphicsCardEnabled="
				+ isGraphicsCardEnabled + ", isBluetoothEnabled=" + isBluetoothEnabled + "]";
	}

	
}
