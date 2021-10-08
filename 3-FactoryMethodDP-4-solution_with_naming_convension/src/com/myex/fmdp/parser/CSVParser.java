package com.myex.fmdp.parser;

import java.io.File;
import java.util.List;

import com.myex.fmdp.Record;

public class CSVParser implements IParser {

	public CSVParser(File file) {
		System.out.println("Creating text parser...");
	}

	@Override
	public List<Record> parse() {
		System.out.println("Parsing CSV and creating reord list ...");
		return null;
	}
}
