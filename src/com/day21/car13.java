package com.day21;

public class car13 extends vehicle13 {

	int speed=100;
	static int duration=100000;
	
	//default constructor.
	public car13() {
		System.out.println("car default constructor");
	}
	
	//one parameter constructor.
	public car13(int speed) {
		this.speed=speed;
		System.out.println(this.speed);
		System.out.println("car one parameter constructor");
	}
	
	//two parameter constructor.
	public car13(int speed,String color) {
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
	
	//static method in car class.
	public static String testing(int a) {
		System.out.println("static method in car class");
		return "a";
	}

}
