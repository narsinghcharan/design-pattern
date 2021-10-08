package com.myex.fmdp.test;

import com.myex.fmdp.BatchProcessor;

public class Test {

	public static void main(String[] args) {
		
		String fileName = "some input file";
		//String fileType = "csv";
		//String fileType = "text";
		String fileType = "xml";
		
		BatchProcessor processor = new BatchProcessor();
		processor.processBatch(fileName,fileType);
		
		System.out.println("done");
	}
}
