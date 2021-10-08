package com.fw.beans;

public class Circle implements IShape {

	private String label;
	private double redius;
	private String fillColour;
	private String lineColour;
	
	public Circle(String label, double redius, String fillColour, String lineColour) {
		this.label = label;
		this.redius = redius;
		this.fillColour = fillColour;
		this.lineColour = lineColour;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public double getRedius() {
		return redius;
	}

	public void setRedius(double redius) {
		this.redius = redius;
	}

	public String getFillColour() {
		return fillColour;
	}

	public void setFillColour(String fillColour) {
		this.fillColour = fillColour;
	}

	public String getLineColour() {
		return lineColour;
	}

	public void setLineColour(String lineColour) {
		this.lineColour = lineColour;
	}

	@Override
	public void draw() {
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "Circle [label=" + label + ", redius=" + redius + ", fillColour=" + fillColour + ", lineColour="
				+ lineColour + "]";
	}

}
