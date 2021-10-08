package com.myex.fmdp.test;

import com.myex.fmdp.BatchProcessor;

public class Test {

	public static void main(String[] args) {
		
		String fileName = "some input file";
		
		BatchProcessor processor = new BatchProcessor();
		processor.processBatch(fileName);
		
		System.out.println("done");
	}
}
