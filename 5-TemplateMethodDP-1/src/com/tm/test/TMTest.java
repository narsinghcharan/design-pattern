package com.tm.test;

import com.tm.base_template.DataRenderer;
import com.tm.subclasses.XMLDataRenderer;

public class TMTest {

	public static void main(String[] args) {
		
		DataRenderer dr = new XMLDataRenderer();
		
		dr.render();
	}
}
