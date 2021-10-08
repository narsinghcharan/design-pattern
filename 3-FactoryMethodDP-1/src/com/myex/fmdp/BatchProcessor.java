package com.myex.fmdp;

import java.io.File;
import java.util.List;

public class BatchProcessor {

	public void processBatch(String fileName) {
		
		File file = openFile(fileName);		//step-1
		
		TextParser parser = new TextParser(file);	//step-2
		
		List<Record> records = parser.parse();		//step-3
		
		
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

 step-1 :- first step is to open the file.
 step-2 :- create a parser which will parse the text file.
 step-3 :- when we parse the text file we will get List of Records
 
 now this application is running fine and our customer is happy. but after sometime customer came back and he ask to parse the comma separated files.

so fulfill this new requirement I have to make some changes in BatchProcessor.java file and here I have to create CSVParser.
but how would my BatchProcessor class will know which Processor class object we need to create. for this we have to pass one more parameter/info to tell the file type. 
 
check in the next application.
*/