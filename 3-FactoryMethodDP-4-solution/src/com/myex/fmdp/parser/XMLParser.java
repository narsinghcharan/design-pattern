package com.myex.fmdp.parser;

import java.io.File;
import java.util.List;

import com.myex.fmdp.Record;

public class XMLParser implements IParser {

	public XMLParser(File file) {
		System.out.println("Creating XML parser...");
	}

	@Override
	public List<Record> parse() {
		System.out.println("Parsing XML and creating reord list ...");
		return null;
	}
}
