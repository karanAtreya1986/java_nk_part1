package com.day21;

public class bmw5  extends car5{
	
	//override start method.
	@Override
	public void start() {
		super.start();
		System.out.println("bmw start method");
	}
	
	//add autoparking method.
	public void autoparking() {
		//we can call parent class variable also using super.
		int i1=super.speed;
		System.out.println(i1);
		//we can call onon overridden method with super also.
		super.refuel();
		System.out.println("bmw auto parking");
		//can call non overridden method like this.
		refuel();
		
	}

}
