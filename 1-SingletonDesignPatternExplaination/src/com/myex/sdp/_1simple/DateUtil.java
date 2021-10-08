package com.myex.sdp._1simple;

public class DateUtil {

	private static DateUtil dateUtil ;
	
	private DateUtil() {
		// make the private constructor
	}
	
	public static DateUtil getInstance() {
		
		if(dateUtil == null) {
			dateUtil = new DateUtil();
		}
		return dateUtil;
	}
}
