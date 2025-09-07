package com.day18;

public class testfor2 {
	
	public static void main(String[] args) {
		
		bmw2 b1=new bmw2();
		//b1 can access all public, static, final of itself, parent and grandparent.
		
		car2 c1=new car2();
		//c1 can access all public, static, final of itself, parent and grandparent.
//		c1.
		
		vehicle2 v1=new vehicle2();
		
		//v1 can access all public, static, final of itself, parent and grandparent.
		
		System.out.println("bmw can access its own static method");
		int carlocation=bmw2.getcarlocation("tiger");
		System.out.println(carlocation);
		
		System.out.println("bmw can access its parent static method");
		bmw2.billing();
		
		System.out.println("bmw can access its grand parent static method");
		bmw2.billing1();
		
		//similarly for the car
		System.out.println("car can access its own static method");
		car2.billing();
		
		System.out.println("car can access its parent static method");
		car2.billing1();
		
		//similarly for vehicle
		System.out.println("vehicle can access its own static method");
		vehicle2.billing1();
	}

}

//bmw can access its own static method
//bmw static method car location
//78
//bmw can access its parent static method
//car -- billing
//bmw can access its grand parent static method
//vehicle static method
//car can access its own static method
//car -- billing
//car can access its parent static method
//vehicle static method
//vehicle can access its own static method
//vehicle static method

