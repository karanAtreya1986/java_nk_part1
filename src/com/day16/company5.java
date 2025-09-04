package com.day16;

public class company5 {
	
	//private constructor.
	private company5(int a) {
		System.out.println("private constructor." + a);
	}
	
	//public constructor also present.
	//Duplicate method company5(int) in type company5
	//we cannot have two constructor with same number of parameters.
	public company5(int c) {
		System.out.println("this is public constructor" + c);
	}
	
	public static int i=10;
	
	public static void getdetails(String name) {
		System.out.println("hello " + name);
	}

}
