package com.day27;

public class strinttoint5 {
	
	public static void main(String[] args) {
		
		//number format exception
		String s1="a";
		int w1=Integer.parseInt(s1);
	}

}

//Exception in thread "main" java.lang.NumberFormatException: For input string: "a"
//	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
//	at java.base/java.lang.Integer.parseInt(Integer.java:588)
//	at java.base/java.lang.Integer.parseInt(Integer.java:685)
//	at com.day27.strinttoint5.main(strinttoint5.java:9)


