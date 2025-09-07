package com.day18;

public class car15 extends vehicle15 {
	
final String type = "Generic Vehicle";
	
	static int i=100;
	
	//override the final and static variables from vehicle15.
	//Cannot override the final method from vehicle15
//	@Override
//	public final void startengine() {
//		System.out.println("car start engine method");
//	}
	
	//The method startengine1() of type car15 must override or implement a supertype method
	@Override
	public static void startengine1() {
		System.out.println("car start engine method");
	}

}
