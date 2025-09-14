package com.day29;

public class npe1 {
	
	public static void main(String[] args) {
		
		//npe when converting string to double.
		String s=null;
		
		double double1 = Double.parseDouble(s);
		System.out.println(double1);
	}

}

//Exception in thread "main" java.lang.NullPointerException: 
//	Cannot invoke "String.trim()" because "in" is null
//at java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:1838)
//at java.base/jdk.internal.math.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
//at java.base/java.lang.Double.parseDouble(Double.java:944)
//at com.day29.npe1.main(npe1.java:9)
