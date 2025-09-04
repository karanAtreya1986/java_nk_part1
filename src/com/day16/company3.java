package com.day16;

public class company3 {
	
	//private constructor.
	private company3() {
		System.out.println("private constructor.");
	}
	
	//how to access methods and variables which are inside private constructor class.
	public static int i=10;
	
	public static void getdetails(String name) {
		System.out.println("hello " + name);
	}

}

