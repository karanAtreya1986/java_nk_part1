package com.day21;

public class car9 extends vehicle9 {

	int speed=100;
	
	//default constructor.
	public car9() {
		System.out.println("car default constructor");
	}
	
	//one parameter constructor.
	public car9(int speed) {
		this.speed=speed;
		System.out.println(this.speed);
		System.out.println("car one parameter constructor");
	}
	
	//two parameter constructor.
	public car9(int speed,String color) {
		this.speed=speed;
		System.out.println(this.speed);
//		System.out.println(this.color);//color cannot be resolved or is not a field
		System.out.println(color);
		System.out.println("car two parameter constructor");
	}

	public void start() {
		System.out.println("car start method");
	}
	
	public void refuel() {
		System.out.println("Car refuel method");
	}

}
