package com.myex.sdp._7lazy_initialization_reflection_api;

import java.io.Serializable;

abstract public class DateUtil implements Serializable , Cloneable{

	private static DateUtil dateUtil ;
	
	private DateUtil() {
		// make the private constructor
	}
	
	public static DateUtil getInstance() { 

		if (dateUtil == null) {
			synchronized (DateUtil.class) {
				if (dateUtil == null) {
					dateUtil = new DateUtil() {};	//object creation using anonymous inner class implementation.
				}
			}
		}
		return dateUtil;
	}
	
	public Object readResolve() {
		
		return dateUtil;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	

}

/*

still DateUtil class object can be created more than one using Reflection API.
then how to fix this?

declare the class as abstract class and create the object using anonymous inner class implementation.

*/