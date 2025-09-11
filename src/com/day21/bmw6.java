package com.day21;

public class bmw6  extends car6{
	
	//own speed method.
	int speed=123324;
	
	//override start method.
	@Override
	public void start() {
		super.start();
		System.out.println("bmw start method");
	}
	
	//add autoparking method.
	public void autoparking() {
		System.out.println("bmw auto parking");
	}
	
	public void displayspeed() {
		//can use this also for accessing class variables.
		System.out.println("speed of bmw is "+ this.speed);
		System.out.println("speed of bmw is "+ speed);
		//call parent class speed
//		System.out.println("speed of parent is " +super.this.speed);
		//Syntax error on token "this", Identifier expected
		int i1=super.speed;
		System.out.println("speed of parent is " +i1);
	}

}
