package com.day18;

public class vehicle15 {
	
	final String type = "Generic Vehicle";
	
	static int i=100;
	
	//create two final methods one with return and other no return.
	public final int getvehiclename(String name) {
		System.out.println("final vehicle method");
		return 23324;
	}
	
	public final void startengine() {
		System.out.println("vehicle start engine method");
	}
	
	//create two static methods one with return and other no return.
	public static int getvehiclename1(String name) {
		System.out.println("final vehicle method");
		return 23324;
	}
	
	public static void startengine1() {
		System.out.println("vehicle start engine method");
	}
}
