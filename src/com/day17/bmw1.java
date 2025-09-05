package com.day17;

public class bmw1 extends car1 {
	
	// Child class with no-parameter method.
	//error.
	//The method start() of type bmw1 must override or implement a supertype method
	  @Override
	    public void start() {
	        System.out.println("BMW -- start");
	    }

}
