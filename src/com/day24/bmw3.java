package com.day24;

public class bmw3  extends car2{

	//private methods cannot be overridden.
	//The method getname(String) of type bmw3 
	//must override or implement a supertype method
	@Override
	private int getname(String name) {
		System.out.println("private method get name");
		return 10;
	}
}
