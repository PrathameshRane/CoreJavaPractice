package com.javatech;

public class HelloWorld {
	
	void nonStaticTest(){
		System.out.println("We are in non-static method");
	}
	
	static void staticTest(){
		
		System.out.println("We are in static method");
	}
	
	public static void main(String[] args){  
		
		
		
		HelloWorld helloWorldObject= new HelloWorld();
	
		helloWorldObject.test();
	
		
		System.out.println("HelloWorld!!!");

		
	}

}
