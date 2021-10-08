package com.fw.beans;

public class Rectangle implements IShape {

	private String label;
	private double length;
	private double breath;
	private String fillColour;
	
	public Rectangle(String label, double length, double breath, String fillColour) {
		this.label = label;
		this.length = length;
		this.breath = breath;
		this.fillColour = fillColour;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreath() {
		return breath;
	}

	public void setBreath(double breath) {
		this.breath = breath;
	}

	public String getFillColour() {
		return fillColour;
	}

	public void setFillColour(String fillColour) {
		this.fillColour = fillColour;
	}

	@Override
	public void draw() {
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "Rectangle [label=" + label + ", length=" + length + ", breath=" + breath + ", fillColour=" + fillColour
				+ "]";
	}

}
