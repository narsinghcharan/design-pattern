package com.tm.subclasses;

import com.tm.base_template.DataRenderer;

public final class TextDataRenderer extends DataRenderer {		//open close rule

	@Override
	public final String readData() {
		
		return "Text Data";
	}

	@Override
	public final String processData(String data) {

		return "Processed" + data;
	}

	
}

/*
just for understanding purpose I have created these subclasses in different package
*/

/*
open close rule :- classes should be open for extension and closed for modification.
*/