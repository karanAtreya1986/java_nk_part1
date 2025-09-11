package com.day21;

public class bmw14  extends car13{
	
	//Super will go to grandparent if immediate parent does not have the variable or method.
	
	//own speed method.
	int speed=123324;
	
	//default constructor.
	public bmw14() {
		super(100);
		System.out.println("bmw default constructor");
		//Super for variables and methods can be anywhere.
		System.out.println(super.speed);
	}
	
	//one parameter constructor.
		public bmw14(int speed) {
			super(speed); //can pass parameter also to parent.
			//not necessary to hard code everytime.
			this.speed=speed;
			System.out.println(this.speed);
			System.out.println("bmw one parameter constructor");
			//Super for variables and methods can be anywhere.
			super.start();
			System.out.println("----------");
			
			//can access static methods also this way.
			String s1=super.testing(10);
			System.out.println(s1);
			
			//access static variable.
			int i1=super.duration;
			System.out.println(i1);
		}
		
		//two parameter constructor.
		public bmw14(int speed,String color) {
			super(speed, color); //can pass parameter also to parent.
			//not necessary to hard code everytime.
			this.speed=speed;
			System.out.println(this.speed);
//			System.out.println(this.color);//color cannot be resolved or is not a field
			System.out.println(color);
			System.out.println("bmw two parameter constructor");
			System.out.println("----------");
			
			//can access static methods also this way.
			//this is better way to access static using class name.
			String s2=car13.testing(20);
			System.out.println(s2);
			
			//access static variables.
			//best way using class name.
			int i1=car13.duration;
			System.out.println(i1);
		}
	
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
	
	//inside method we cannot use super and call constructor
	//method cannot call constructor.
	public void billing() {
		super(10);//Constructor call must be the first statement in a constructor
	}

}
