package com.day18;

public class car11 extends vehicle11 {
	
	String type = "Car CLASs";
	
	//override the same method from vehicle11.
	@Override
	public void startengine() {
		System.out.println("car start engine method");
	}

}
