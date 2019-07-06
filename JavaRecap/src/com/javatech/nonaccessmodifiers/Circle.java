package com.javatech.nonaccessmodifiers;

public class Circle extends Shape {
	
	double radius;
	
	double area(){
		return NonStaticModifierTest.PI*radius*radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	

}
