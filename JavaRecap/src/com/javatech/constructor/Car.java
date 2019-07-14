package com.javatech.constructor;

public class Car {

	int speed;
	String type;
	
	Car(){
		this.speed=200;
		this.type="AC";
	}
	Car(int s,String t){
		this.speed=s;
		this.type=t;
		
	}
	
	public void info() {
		System.out.println("*****CarInfo*****");
		System.out.println("This car speed is: "+speed);
		System.out.println("This Car type is: "+type);
	}
	
}
