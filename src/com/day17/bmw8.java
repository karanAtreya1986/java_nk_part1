package com.day17;

public class bmw8 extends car8 {
	
	//private methods can be overloaded.


	//The method billing() from the type bmw8 is never used locally
	private void billing() {
        System.out.println("car -- billing");
    }
	
//The method getnumber(int) from the type bmw8 is never used locally
	private static int getnumber(int a) {
		System.out.println("return the car number");
		return 10;
	}

}
