package com.day21;

public class bmw10  extends car10{
	
	//Super will go to grandparent if immediate parent does not have the variable or method.
	
	//own speed method.
	int speed=123324;
	
	//default constructor.
	public bmw10() {
		super(100);
		System.out.println("bmw default constructor");
	}
	
	//one parameter constructor.
		public bmw10(int speed) {
			super(200, "green");
//			super(); //Constructor call must be the first statement in a constructor
			//cannot use two super at same time.
			this.speed=speed;
			System.out.println(this.speed);
//			super(200, "green");//Constructor call must be the first statement in a constructor
			//super should be first line in constructor.
			System.out.println("bmw one parameter constructor");
		}
		
		//two parameter constructor.
		public bmw10(int speed,String color) {
			super();
			this.speed=speed;
			System.out.println(this.speed);
//			System.out.println(this.color);//color cannot be resolved or is not a field
			System.out.println(color);
			System.out.println("bmw two parameter constructor");
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

}
