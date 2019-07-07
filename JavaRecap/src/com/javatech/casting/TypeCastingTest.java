package com.javatech.casting;

public class TypeCastingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =23;
		String s="15";
		Integer a2=54;
		System.out.println("Int a: "+a);
		System.out.println("String s: "+s);
		System.out.println("Int conversion of s: "+Integer.parseInt(s));
		System.out.println("Integer class coversion(Integer.valueOf) of s: "+Integer.valueOf(s));
		System.out.println("String conversion of int(Integer.toString): "+Integer.toString(a));
		System.out.println("String conversion of int(String.valueOf): "+String.valueOf(a2));
		
	}

}
