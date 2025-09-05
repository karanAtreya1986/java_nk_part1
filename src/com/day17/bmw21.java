package com.day17;

public class bmw21 extends car2{
	
	//sequence also matters how we write the parameters in parent and child.
	//if sequence not proper then cannot override.
	//The method start(String, int) of type bmw21 must override or implement a supertype method
	 @Override
	    public void start(String b, int a) {
	        System.out.println("BMW -- start");
	    }

}
