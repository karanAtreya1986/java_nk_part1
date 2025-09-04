package com.day16;

public class company6 {
	
	//private constructor.
	private company6(int a) {
		System.out.println("private constructor." + a);
	}
	
	//private method.
	private void getdetails(String name) {
		System.out.println("get details method." + name);
	}
	
	private void getaddress() {
		System.out.println("getaddress method");
	}
	
	private static void getphonenumber() {
		System.out.println("getphonenumber method");
	}
	
	private static void getlocation(String location) {
		System.out.println("getlocation method " +location);
	}
	
//one public method to call all private methods.
	//encapsulation concept.
	public static void getalldetails(String name, String location) {
		//how to access private constructor inside public static method.
		company6 c1=new company6(10);
		c1.getdetails(name);
		c1.getaddress();
		getphonenumber();
		getlocation(location);
	}

}
