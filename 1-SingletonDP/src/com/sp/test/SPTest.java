package com.sp.test;

import com.sp.pattern.Worker;

public class SPTest {
	public static void main(String[] args) throws ClassNotFoundException,
			CloneNotSupportedException {

		Worker worker = new Worker();
		for (int i = 0; i < 100; i++) {
			Thread t = new Thread(worker);
			t.start();
		}

	}
}
