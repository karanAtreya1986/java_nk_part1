package com.day26;

import java.util.Iterator;

public class reversestring1 {
	
	public static String reverseString(String name) {
		
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
	}

}

//muineles

