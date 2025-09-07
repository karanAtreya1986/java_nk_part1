package com.day18;

public class car16 extends vehicle15 {
	
final String type = "Generic Vehicle";
	
	static int i=100;
	
	//even without overload annotation the same error for final methods.
	
//Cannot override the final method from vehicle15
	public final void startengine() {
		System.out.println("car start engine method");
	}
	
//method hiding.
	public static void startengine1() {
		System.out.println("car start engine method");
	}

}
