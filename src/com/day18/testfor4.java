package com.day18;

public class testfor4 {
	
	public static void main(String[] args) {
		
		//here we wont get child class methods.
		car4 c1=new car4();
		c1.carmethod1();
		c1.carmethod2();
		
		//here we wont get child class methods.
		car4 c2=new audi4();
		c2.carmethod1();
		c2.carmethod2();
	}

}

//car method 1
//car method 2
//car method 1 in audi
//car method 2
