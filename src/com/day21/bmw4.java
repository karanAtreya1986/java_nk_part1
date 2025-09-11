package com.day21;

public class bmw4  extends car3{
	
	//override start method.
	@Override
	public void start() {
		//super in method can be written as first line or any line.
		super.start();
		System.out.println("bmw start method");
		//to call parent class method with same name.
//		super.start();
	}
	
	//add autoparking method.
	public void autoparking() {
		//we can call parent class variable also using super.
		int i1=super.speed;
		System.out.println(i1);
		System.out.println("bmw auto parking");
	}

}
