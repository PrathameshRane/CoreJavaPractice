package com.javatech.stringtest;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="Hello";
		String s3 ="Hello";
		String s2 = new String("Hello");
		s2+=" World";
		
		StringBuffer sb = new StringBuffer("Hello");
		sb.append(" World");
				
		System.out.println(s);
		System.out.println(s.hashCode());
		System.out.println(s3);
		System.out.println(s3.hashCode());
		if(s.hashCode()==s3.hashCode())
			System.out.println("Pointing to same string");
		System.out.println(s2);
		System.out.println(s2.hashCode());
		System.out.println(sb);
		System.out.println(sb.hashCode());

	}

}
