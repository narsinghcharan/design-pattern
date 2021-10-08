package com.myex.sdp._5lazy_initialization_cloneable;

import java.io.Serializable;

public class DateUtil implements Serializable{

	private static DateUtil dateUtil ;
	
	private DateUtil() {
		// make the private constructor
	}
	
	public static DateUtil getInstance() { 

		if (dateUtil == null) {
			synchronized (DateUtil.class) {
				if (dateUtil == null) {
					dateUtil = new DateUtil();
				}
			}
		}
		return dateUtil;
	}
	
	public Object readResolve() {
		return dateUtil;
	}
}

/*

still we can create the object using serialization and de-serialization process.

to fix this we need to write readResolve() method as part of the singleton class.
at the time of de-serialization process JVM will call the readResolve() method to read the byte 
stream to build object.

if we write this method and return the same instance of the class, we can avoid creating more than 
one object in case of serialization as well.

*/