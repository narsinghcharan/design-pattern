package com.myex.fmdp.simple_paser_factory;

import java.io.File;

import com.myex.fmdp.BatchProcessor;
import com.myex.fmdp.parser.CSVParser;
import com.myex.fmdp.parser.IParser;

public class CSVParcerFactory extends BatchProcessor{

	@Override
	public IParser createParser(File file) {
		return new CSVParser(file);
	}
}
