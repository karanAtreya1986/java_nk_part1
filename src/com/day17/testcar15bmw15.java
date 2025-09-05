package com.day17;

public class testcar15bmw15 {
	
	public static void main(String[] args) {
		
		//no overrding of variables.
		//hence proved.
		//bmw can change its speed.
		//car cannot change its speed as its final.
		
		bmw15 b1=new bmw15();
		int speed = b1.speed;
		System.out.println(speed);
		
		b1.speed=324324;
		speed = b1.speed;
		System.out.println(speed);
		
		car15 c1=new car15();
		int speed2 = c1.speed;
		System.out.println(speed2);
		
//		c1.speed=234324; //The final field car15.speed cannot be assigned
//		speed2 = c1.speed;
//		System.out.println(speed2);
	}

}

//100
//324324
//10

