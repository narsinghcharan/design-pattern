package com.tm.subclasses;

import com.tm.base_template.DataRenderer;

public final class XMLDataRenderer extends DataRenderer {		//open close rule

	@Override
	public String readData() {	

		return "XML Data";
	}

	@Override
	public String processData(String data) {

		return "Processed" + data;
	}
}

/*
just for understanding purpose I have created these subclasses in different package
*/

/*
open close rule :- classes should be open for extension and closed for modification.
*/