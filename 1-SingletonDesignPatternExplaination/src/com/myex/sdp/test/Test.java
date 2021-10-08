package com.myex.sdp.test;

import com.myex.sdp._4lazy_initialization_synchronization.DateUtil;

public class Test {

	public static void main(String[] args) {
		
		
		Thread t = new Thread(() ->  {
			
			for(int i=1;i<=10;i++) {
				DateUtil.getInstance();
			}
		});
		
		t.start();
		
		for(int i=1;i<=10;i++) {
			DateUtil.getInstance();
		}
	}
}

/*
it is lazy initialization because it will not create the object until someone calls getInstance() method (when object is needed).

but the problem with this is in multithreaded environment when more than one thread are executing at the same time, it might end-up in creating more than one instance of the class.

To avoid this we can even declare that method as synchronized.
*/