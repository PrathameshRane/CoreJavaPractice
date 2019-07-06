package com.javatech.nonaccessmodifiers;

public class NonStaticModifierTest {
	
	final static double PI = 3.14; //cannot change the value of PI as it marked as Final
	
	public static void main(String[] args){
		
		Circle c = new Circle();
		Rectangle r = new Rectangle();
		
		c.setColor("Red");
		c.setRadius(5);
		System.out.println("Area of Circle: "+c.area());
		
		r.setColor("Green");
		r.setLength(5);
		r.setWidth(10);
		System.out.println("Area of Rectangle: "+r.area());
		
		
		
		
	}
	
	

}
