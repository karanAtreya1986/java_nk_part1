package com.day16;

public class company2 {
	
	//private constructor.
	private company2() {
		System.out.println("private constructor.");
	}
	
	//how to access methods and variables which are inside private constructor class.
	public static int i=10;
	
	public static void getdetails(String name) {
		System.out.println("hello " + name);
	}
	
	public static void main(String[] args) {
		
		company2.getdetails("karan");
		int v=company2.i;
		System.out.println(v);
	}

}

//hello karan
//10
