package com.day17;

public class testcar13bmw13 {
	
	public static void main(String[] args) {
		
		bmw13 b1=new bmw13();
		int speed = b1.speed;
		//private variables cant be accessed without encapsulation.
		System.out.println(speed);
		
		b1.speed=2323434;
		speed = b1.speed;
		System.out.println(speed);
		
		car13 c1=new car13();
		int speed2 = c1.speed;
		System.out.println(speed2);
		
		c1.speed=234324;
		speed2 = c1.speed;
		System.out.println(speed2);
	}

}

//100
//2323434
//10
//234324
