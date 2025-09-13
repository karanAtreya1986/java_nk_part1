package com.day24;

public class bmw7  extends car2{

	public static void main(String[] args) {
		
//		Always go towards right.
//		If parent class has protected, then in child class can have public or protected only.

		
		bmw7 b1=new bmw7();
		String s1=b1.color;
		System.out.println(s1);
		b1.carname("karan");
	}
	//protected can become public in car.
	@Override
	public void carname(String a) {
		System.out.println("protected method inside child class bmw");
	}
	
}

//null
//protected method inside child class bmw


