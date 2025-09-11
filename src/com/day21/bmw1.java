package com.day21;

public class bmw1  extends car1{
	
	//override start method.
	@Override
	public void start() {
		System.out.println("bmw start method");
	}
	
	//add autoparking method.
	public void autoparking() {
		System.out.println("bmw auto parking");
	}

}
