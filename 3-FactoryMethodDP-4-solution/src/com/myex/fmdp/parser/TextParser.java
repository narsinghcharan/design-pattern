package com.myex.fmdp.parser;

import java.io.File;
import java.util.List;

import com.myex.fmdp.Record;

public class TextParser implements IParser {
	
	public TextParser(File file) {
		System.out.println("Creating text parser...");
	}

	@Override
	public List<Record> parse() {
		System.out.println("Parsing text and creating reord list ...");
		return null;
	}

}
