package com.day27;

public class strinttoint2 {
	
	public static void main(String[] args) {
		
		//number format exception.
		String x="100a";
		int i=Integer.parseInt(x);
		System.out.println(i);
	}

}

//Exception in thread "main" java.lang.NumberFormatException: For input string: "100a"
//	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
//	at java.base/java.lang.Integer.parseInt(Integer.java:588)
//	at java.base/java.lang.Integer.parseInt(Integer.java:685)
//	at com.day27.strinttoint2.main(strinttoint2.java:9)

