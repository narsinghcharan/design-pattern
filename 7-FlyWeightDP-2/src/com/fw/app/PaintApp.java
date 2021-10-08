package com.fw.app;

import com.fw.beans.IShape;
import com.fw.beans.Rectangle;
import com.fw.factory.ShapeFactory;

public class PaintApp {

	public void render(int noOfShape) {
		
		IShape[] shape = new IShape[noOfShape];
		
		for(int i = 0 ; i<noOfShape ; i++) {
			
			if(i%2 == 0) {
				shape[i] = ShapeFactory.getShape("circle");
				shape[i].draw(i, "yellow", "red");
			}else {
				shape[i] = ShapeFactory.getShape("rectangle");
				shape[i].draw(i*2, i, "pinck");
			}
			System.out.println();
		}
	}
}
