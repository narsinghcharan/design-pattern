package com.myex.fmdp;

import java.io.File;
import java.util.List;

public class BatchProcessor {

	public void processBatch(String fileName, String fileFormat) {
		
		File file = openFile(fileName);		
		
		TextParser parser = null;
		if("text".equals(fileFormat)) {
			parser = new TextParser(file);
		}
		else if("csv".equals(fileFormat)) {
			parser = new CSVParser(file);
		}
		
		List<Record> records = parser.parse();
		
		processRecords(records);
		writeSummary();
		closeFile(file);
	}

	private File openFile(String fileName) {
		System.out.println("Opened file ...");
		return null;
	}

	private void processRecords(List<Record> records) {
		System.out.println("Processing each rcord.. DB calls .... etc...");	
	}
	
	private void writeSummary() {
		System.out.println("Write Batch summmary - 0 failed");	
	}

	private void closeFile(File file) {
		System.out.println("Closed file...");
		
	}
}


/*

processBatch() :-

initially this method has to create the text parser which will parse the file .


now this application is running fine and our customer is happy. but after sometime customer came back and he ask to parse the comma separated files.

so fulfill this new requirement I have to make some changes in BatchProcessor.java file and here I have to create CSVParser.
but how would my BatchProcessor class will know which Processor class object we need to create. for this we have to pass one more parameter/info to tell the file type. 
 
so here I have added the CSV capabilities into my BarchProcessor and that is running fine.


but now after sometime the customer came and he asked for having the xml parsing capability also.

so check in the next application.

*/