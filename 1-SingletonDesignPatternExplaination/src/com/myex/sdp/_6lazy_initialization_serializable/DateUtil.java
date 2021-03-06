package com.myex.sdp._6lazy_initialization_serializable;

import java.io.Serializable;

public class DateUtil implements Serializable , Cloneable{

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

	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	
}

/*

still we can create more than one object of this DateUtil class using clone.

to fix this we will override the clone() method and change access modifier from protected to public
so that any one can call the clone() on the DateUtil class but in that method we will through the 
Exception.

*/