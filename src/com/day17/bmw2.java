package com.day17;

public class bmw2 extends car {
	
	//method overriding.
	
	//Override annotation is not mandatory to write. It makes the code readable.

	
	@Override
	public void start() {
        System.out.println("BMW -- start");
    }

	@Override
	//The method autoParking() of type bmw2 must override 
	//or implement a supertype method.
//	We cannot write override on a method which is not overridden. Compile error.
    public void autoParking() {
        System.out.println("BMW -- auto parking");
    }

}
