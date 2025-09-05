package com.day17;

public class bmw6 extends car6 {

	//This instance method cannot override the static method from car4
//    public void billing() {
//        System.out.println("bmw -- billing");
//    }
    
	//The method billing() of type bmw6 must override or implement a supertype method
    @Override
    public void billing() {
        System.out.println("bmw -- billing");
    }

}
