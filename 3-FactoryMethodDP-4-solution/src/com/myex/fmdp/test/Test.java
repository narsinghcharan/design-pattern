package com.myex.fmdp.test;

import com.myex.fmdp.BatchProcessor;
import com.myex.fmdp.simple_paser_factory.CSVParcerFactory;
import com.myex.fmdp.simple_paser_factory.TextParserFactory;
import com.myex.fmdp.simple_paser_factory.XMLParserFactory;

public class Test {

	public static void main(String[] args) {
		
		String fileName = "some input file";
		//String fileType = "csv";
		//String fileType = "text";
		String fileType = "xml";
		
		BatchProcessor processor = createBatchProcessor(fileType);
		
		processor.processBatch(fileName);
		
		System.out.println("done");
	}

	private static BatchProcessor createBatchProcessor(String fileType) {
		
		if("text".equals(fileType)) {
			return new TextParserFactory();
		}
		else if("csv".equals(fileType)) {
			return new CSVParcerFactory();
		}
		else if("xml".equals(fileType)) {
			return new XMLParserFactory();
		}
		return null;
	}
}
