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
	
			System.out.println("HelloWorld!!!");

			helloWorldObject.nonStaticTest();  ///non static called on created object
			
			
			HelloWorld.staticTest();    ///static method called on class directly
			
		
	}

}
