package com.day26;

import java.util.Iterator;

public class reversestring3 {
	
	public static String reverseString(String name) {
		
		//when string length is 1 then return as is.
		if(name.length()==1) {
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
		
		//we didnt handle null well.
		String s31=null;
		String s4=reverseString(s31);
		System.out.println(s4);
	}

}

//muineles
//k
//Exception in thread "main" java.lang.NullPointerException: 
//	Cannot invoke "String.length()" because "name" is null
//	at com.day26.reversestring3.reverseString(reversestring3.java:10)
//	at com.day26.reversestring3.main(reversestring3.java:37)


