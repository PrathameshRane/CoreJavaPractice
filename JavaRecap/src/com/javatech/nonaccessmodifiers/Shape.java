package com.javatech.nonaccessmodifiers;

public abstract class Shape {

	String color;

	
	abstract double area();


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}
	
	
}
