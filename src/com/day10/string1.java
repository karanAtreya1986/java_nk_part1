package com.day10;

public class string1 {
	
	public static void main(String[] args) {
		
		//cannot compare null with any other values.
		
		String s1=null;
		System.out.println(s1.equals("karan"));
	}

}

//Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.equals(Object)" because "s1" is null
//at com.day10.string1.main(string1.java:8)