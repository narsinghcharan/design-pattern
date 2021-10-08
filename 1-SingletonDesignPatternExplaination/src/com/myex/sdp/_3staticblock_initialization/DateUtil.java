package com.myex.sdp._3staticblock_initialization;

public class DateUtil {

	//declare a static member of the same class type in the class
	//instantiating the instance attribute when  the class is loaded.
	private static DateUtil dateUtil;
	
	//static block executes only once when the class has been loaded.
	static {
		dateUtil = new DateUtil();
	}
	
	private DateUtil() {
		// make the private constructor
	}
	
	public static DateUtil getInstance() {
		return dateUtil;
	}
}

/*
but the problem here is even we don't need the object also it will be instantiated before the hand.

that's why we will go for lazy initialization.
*/