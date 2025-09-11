package com.day21;

public class bmw2  extends car2{
	
	//override start method.
	@Override
	public void start() {
		System.out.println("bmw start method");
		start(); //goes into infinite loop.
		//stack overflow.
	}
	
	//add autoparking method.
	public void autoparking() {
		System.out.println("bmw auto parking");
	}

}
