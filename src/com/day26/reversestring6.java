 	package com.day26;

import java.util.Iterator;

public class reversestring6 {

	public static String reverseString(String name) {

		if(name==null) {
			throw new RuntimeException("string cannot be null");
		}

		//when string length is 1 then return as is.
		if(name.length()==1 || name.length()==0) {
			return name;
		}
		
		

		int len=name.length();

		String rev="";

		for(int i=len-1;i>=0;i--) {

			rev=rev+name.charAt(i);
		}

		return rev;
	}

	public static void main(String[] args) {

		

		String s1="selenium";
		String s2=reverseString(s1);
		System.out.println(s2);

		String s21="k";
		String s3=reverseString(s21);
		System.out.println(s3);
		
		String s5=" ";
		String s6=reverseString(s5);
		System.out.println(s6);
		
		String s61="";
		String s7=reverseString(s61);
		System.out.println(s7);
		
		String s31=null;
		String s4=reverseString(s31);
		System.out.println(s4);



	}

}

//muineles
//k
// 
//
//Exception in thread "main" java.lang.RuntimeException: string cannot be null
//	at com.day26.reversestring6.reverseString(reversestring6.java:10)
//	at com.day26.reversestring6.main(reversestring6.java:53)





