package com.day21;

public class bmw8  extends car8{
	
	//Super will go to grandparent if immediate parent does not have the variable or method.
	
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
		System.out.println("speed of bmw is "+ this.speed);
		System.out.println("speed of bmw is "+ speed);
		//call parent class speed
//		System.out.println("speed of parent is " +super.this.speed);
		//Syntax error on token "this", Identifier expected
		int i1=super.speed;
		System.out.println("speed of parent is " +i1);
		
		//try accessing grand parent speed.
		//Syntax error on token "super", Identifier expected
//		super.super.speed;
		String s1=super.vehiclestatus(10);
		System.out.println(s1);
	}

}
