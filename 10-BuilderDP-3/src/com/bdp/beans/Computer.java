package com.bdp.beans;

public class Computer {

	//required parameters
	private String ram;
	private String hdd;
	private String cpu;
	
	//optional parameters
	private boolean isGraphicsCardEnabled;
	private boolean isBluetoothEnabled;
	
	//Computer class object declared as private
	private Computer(ComputerBuilder builder) {
		this.ram = builder.ram;
		this.hdd = builder.hdd;
		this.cpu = builder.cpu;
		this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
		this.isBluetoothEnabled = builder.isBluetoothEnabled;
	}

	//builder class declared as static nested inner class
	public static class ComputerBuilder {

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

	@Override
	public String toString() {
		return "Computer [ram=" + ram + ", hdd=" + hdd + ", cpu=" + cpu + ", isGraphicsCardEnabled="
				+ isGraphicsCardEnabled + ", isBluetoothEnabled=" + isBluetoothEnabled + "]";
	}
}

/*

Now here until we create the builder class object we can't create Computer class object because 
in the Computer class constructor is declared as private and also we have to pass builder class object.

we will write this builder class as static nested class inside Computer class, because any one 
using the Computer class, is going to use the builder.
In order to completely prevent instance creation without using the builder, we need to make the 
builder part of the class.

anyhow this application is best approach.

reference :- https://www.youtube.com/watch?v=mFCk31FoUg4
https://www.youtube.com/watch?v=D5NK5qMM14g&t=302s

*/
