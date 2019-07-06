package com.javatech;

public class HelloWorld {
	
	void test(){
		System.out.println("We are in no-static method");
	}
	
	public static void main(String[] args){  
		
		
		HelloWorld helloWorldObject= new HelloWorld();
		String[] strArray1 = new String[] {"A","B","C"};
		helloWorldObject.test();
	
		
		System.out.println("HelloWorld!!!");
		System.out.println("We are in static method");
		
	}

}
