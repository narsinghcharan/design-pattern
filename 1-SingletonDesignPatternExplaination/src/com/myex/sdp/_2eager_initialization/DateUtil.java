package com.myex.sdp._2eager_initialization;

public class DateUtil {

	//declare a static member of the same class type in the class
	//instantiating the instance attribute when  the class is loaded.
	private static DateUtil dateUtil = new DateUtil();
	
	private DateUtil() {
		// make the private constructor
	}
	
	public static DateUtil getInstance() {
		
		return dateUtil;
	}
}

/*
but the problem here is even we don't need the object also it will be instantiated before the hand.

*/