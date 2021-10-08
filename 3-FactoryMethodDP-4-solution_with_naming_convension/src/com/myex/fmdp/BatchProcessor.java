package com.myex.fmdp;

import java.io.File;
import java.util.List;

import com.myex.fmdp.parser.CSVParser;
import com.myex.fmdp.parser.IParser;
import com.myex.fmdp.parser.TextParser;
import com.myex.fmdp.parser.XMLParser;

public abstract class BatchProcessor {

	public final void processBatch(String fileName, String fileFormat) {
		
		File file = openFile(fileName);		
		IParser parser = createParser(file);		//calling Factory Method
		List<Record> records = parser.parse();
		processRecords(records);
		writeSummary();
		closeFile(file);
	}
	
	//Factory Method
	public abstract IParser createParser(File file);

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

so again I have create one more parer and again changed the BatchProcessor class.


problem :-

Here for every change in the requirement of the parser or the file type we have to touch and change the processBatch() method of BatchProcessing.
so the chances raising the new bug is nore.

Here we are violating one of the oop principle which is Open close principle :- classes should be open for extension but closed
for modification.

one more thing is, our high level class which is BatchProcessor is dealing with concrete classes. and this is also one violation of design principle called 
dependency inversion 

*/