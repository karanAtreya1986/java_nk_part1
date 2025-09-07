package com.day18;

public class testfor13 {
	
	public static void main(String[] args) {
		
		//how to call individual class method.
		//create object of that class.
		
		//create object of bmw13.
		bmw13 b1=new bmw13();
		b1.startengine(); //bmw start engine method

		//child has its own method so called from there.
		
		//create object of car13.
		car13 c1=new car13();
		c1.startengine(); //car start engine method
		
		//create object of vehicle13.
		vehicle13 v1=new vehicle13();
		v1.startengine(); //vehicle start engine method
		
		
	}

}
