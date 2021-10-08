package com.myex.sdp._4lazy_initialization_synchronization;

public class DateUtil {

	//private static DateUtil dateUtil ;
	private static volatile DateUtil dateUtil ;			//note:6
	
	private DateUtil() {
		// make the private constructor
		System.out.println("DateUtil class consstructor called...");
	}
/*	
	public static DateUtil getInstance() {		//note:1
		
		if(dateUtil == null) {
			dateUtil = new DateUtil();
		}
		return dateUtil;
	}
*/
/*	
	public synchronized static DateUtil getInstance() {		//note:2
		
		if(dateUtil == null) {
			dateUtil = new DateUtil();
		}
		return dateUtil;
	}
*/
/*
	public static DateUtil getInstance() {		//note:3

		synchronized (DateUtil.class) {
			if (dateUtil == null) {
				dateUtil = new DateUtil();
			}
		}
		return dateUtil;
	}
*/
/*
	public static DateUtil getInstance() { // note:4

		if (dateUtil == null) {
			synchronized (DateUtil.class) {
				dateUtil = new DateUtil();
			}
		}
		return dateUtil;
	}
*/

	public static DateUtil getInstance() { // note:5

		if (dateUtil == null) {
			synchronized (DateUtil.class) {
				if (dateUtil == null) {
					dateUtil = new DateUtil();
				}
			}
		}
		return dateUtil;
	}

}

/*
note1 :- it is lazy initialization because it will not create the object until someone calls getInstance() method (when object is needed).

note2 :-
but the problem with this is in multithreaded environment when more than one thread are executing at the same time, it might end-up in creating more than one instance of the class.

To avoid this we can even declare that method as synchronized.

note3 :-
but instead of making the whole method as synchronized, it is enough to enclose only the conditional check in synchronized block..


note 4 :-

again we have a problem with the above piece of code, after the first call to the getInstance() method, in the next call to the method,  we will check
for dateUtil == null check.
for every time while doing this check it requires the lock to verify the condition which is not required. Acquiring and releasing locks are quite costly and we should avoid as must as we can.

to fix this we will place synchronized block inside "if" condition.


note 5:-

still we will face the problem in multithreaded env.
to fix this we will apply the double check 

note 6: -
it is recommended to declare th static member instance as volatile to avoid problems in a multi-threaded env. 
*/