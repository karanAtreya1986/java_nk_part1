package com.day17;

public class bmw4 extends car4 {
	
	
	//parent class has static method.
	//child class has same overridden static method.
	//not allowed.
	//error.
//	The method billing() of type bmw4 must override or implement a supertype method
//	@Override
//    public static void billing() {
//        System.out.println("car -- billing");
//    }
	
	//static method can be overloaded.
	//called as method hiding.
	//Static method overloaded is called method hiding.

    public static void billing() {
        System.out.println("bmw -- billing");
    }

}
