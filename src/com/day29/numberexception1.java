package com.day29;

public class numberexception1 {
	
	public static void main(String[] args) {
		
		//number format when string to integer.
		String s=null;
		
		int int1 = Integer.parseInt(s);
		System.out.println(int1);
	}

}

//Exception in thread "main" java.lang.NumberFormatException: Cannot parse null string
//at java.base/java.lang.Integer.parseInt(Integer.java:550)
//at java.base/java.lang.Integer.parseInt(Integer.java:685)
//at com.day29.numberexception1.main(numberexception1.java:10)

