package com.day18;

public class car14 extends vehicle14 {
	
	String type = "Car CLASs";
	
	//override the same method from vehicle11.
	@Override
	public void startengine() {
		System.out.println("car start engine method");
	}
	
	//create one method and call the bmw14 method here.
	public void karanmethod() {
		bmw14 b1=new bmw14();
		b1.method5();
	}

}
