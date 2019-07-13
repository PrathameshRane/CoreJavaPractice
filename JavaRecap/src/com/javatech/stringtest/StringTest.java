package com.javatech.stringtest;


import java.util.Hashtable;
import java.util.StringTokenizer;

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
		
		System.out.println(s.compareTo(s3));
		
		
		String decResp="order_id=12313&ref_no=108&status=success&";
		StringTokenizer st = new StringTokenizer(decResp,"&");
		String pair=null,pname=null,pvalue=null;
		Hashtable hs= new Hashtable();
		while(st.hasMoreTokens())
		{
			pair=(String)st.nextToken();
			
			StringTokenizer st2 = new StringTokenizer(pair,"=");
			pname="";pvalue="";
			if(st2.hasMoreTokens())
				pname=(String)st2.nextToken();
               System.out.println(pname);
				if(st2.hasMoreTokens())
					pvalue=(String)st2.nextToken();
				System.out.println(pvalue);
				hs.put(pname, pvalue);
			
		}

	}

}
