package com.fw.factory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.fw.beans.Circle;
import com.fw.beans.IShape;
import com.fw.beans.Rectangle;

public class ShapeFactory {

	private static Map<String,IShape> shapeCache = null;
	
	static {
		shapeCache = new ConcurrentHashMap<String, IShape>();
	}
	
	public static IShape getShape(String shapeType) {
		IShape shape = null;
		
		if(shapeCache.containsKey(shapeType)) {
			shape =  shapeCache.get(shapeType);
		}else {
			
			if("circle".equals(shapeType)) {
				shape = new Circle();
			}else if("rectangle".equals(shapeType)) {
				shape = new Rectangle(); 
			}
			
			shapeCache.put(shapeType, shape);
		}
		return shape;
	}
}
