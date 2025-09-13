package com.day26;

import java.util.Iterator;

public class reversestring8 {

	public static String reverseString(String name) {

		//cant compare like this.
		//we get npe.
		if(name.equals("null")) {
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
//Exception in thread "main" java.lang.NullPointerException: 
//	Cannot invoke "String.equals(Object)" because "name" is null
//	at com.day26.reversestring8.reverseString(reversestring8.java:11)
//	at com.day26.reversestring8.main(reversestring8.java:55)







