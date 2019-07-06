package com.javatech.nonaccessmodifiers;

public class Rectangle extends Shape {

	double length;
	double width;
	
	double area(){
		return length*width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	
	
	
}
