package com.myex.fmdp.simple_paser_factory;

import java.io.File;

import com.myex.fmdp.BatchProcessor;
import com.myex.fmdp.parser.IParser;
import com.myex.fmdp.parser.XMLParser;

public class XMLParserFactory extends BatchProcessor{

	@Override
	public IParser createParser(File file) {
		return new XMLParser(file);
	}

}
