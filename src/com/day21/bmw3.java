package com.day21;

public class bmw3  extends car3{
	
	//override start method.
	@Override
	public void start() {
		System.out.println("bmw start method");
		//to call parent class method with same name.
		super.start();
	}
	
	//add autoparking method.
	public void autoparking() {
		System.out.println("bmw auto parking");
	}

}
