package com.day16;

public class company1 {
	
	//private constructor.
	private company1() {
		System.out.println("private constructor.");
	}
	
	//how to access methods and variables which are inside private constructor class.
	//create everything as static so we dont have to create objects.
	public static int i=10;
	
	public static void getdetails(String name) {
		System.out.println("hello " + name);
	}

}
