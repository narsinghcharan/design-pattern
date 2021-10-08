package com.fw.beans;

public class Circle extends IShape {

	private String label;

	public Circle() {
		label = "circle";
		System.out.println(label);
	}

	@Override
	public void draw(double redius, String fillColour, String lineColour) {
		
		System.out.println( "Circle [label=" + label + ", redius=" + redius + ", fillColour=" + fillColour + ", lineColour="
				+ lineColour + "]");
	}

}
