package com.fw.beans;

public class Rectangle extends IShape {

	private String label;

	public Rectangle() {
		label = "rectangle";
		System.out.println(label);
	}

	@Override
	public void draw(double length, double breath, String fillColour) {

		System.out.println("Rectangle [label=" + label + ", length=" + length + ", breath=" + breath + ", fillColour=" + fillColour
				+ "]");
	}

}
