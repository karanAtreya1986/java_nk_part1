package com.day16;

public class company4 {
	
	//private constructor.
	private company4(int a) {
		System.out.println("private constructor." + a);
	}
	
	//public constructor also present.
	public company4(String c) {
		System.out.println("this is public constructor" + c);
	}
	
	//how to access methods and variables which are inside private constructor class.
	//create everything as static so we dont have to create objects.
	public static int i=10;
	
	public static void getdetails(String name) {
		System.out.println("hello " + name);
	}

}
