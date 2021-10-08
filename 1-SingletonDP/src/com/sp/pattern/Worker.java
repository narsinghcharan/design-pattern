package com.sp.pattern;

public class Worker implements Runnable {

	@Override
	public void run() {
		DateUtil.getInstance();
	}

}
