package com.day17;

public class bmw7 extends car7 {
	
	//Cannot override private method.


	//The method billing() of type bmw7 must override or implement a supertype method
	@Override
	private void billing() {
        System.out.println("car -- billing");
    }
	
	//The method getnumber(int) of type bmw7 must override or implement a supertype method
	@Override
	private static int getnumber(int a) {
		System.out.println("return the car number");
		return 10;
	}

}
