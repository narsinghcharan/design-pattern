package com.fw.app;

import com.fw.beans.Circle;
import com.fw.beans.IShape;
import com.fw.beans.Rectangle;

public class PaintApp {

	public void render(int noOfShape) {
		
		IShape[] shape = new IShape[noOfShape];
		
		for(int i = 0 ; i<noOfShape ; i++) {
			
			if(i%2 == 0) {
				shape[i] = new Circle("circle", 1*1, "yellow", "red");
				shape[i].draw();
			}else {
				shape[i] = new Rectangle("rectangle", i*2, i, "pinck");
				shape[i].draw();
			}
			System.out.println();
		}
	}
}
