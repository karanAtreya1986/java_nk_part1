package com.day18;

public class car12 extends vehicle12 {
	
	String type = "Car CLASs";
	
	//override the same method from vehicle11.
	@Override
	public void startengine() {
		System.out.println("car start engine method");
	}

}
