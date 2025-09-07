package com.day18;

public class car5 extends vehicle5 {
	
	@Override
    public void start() {
		System.out.println("====method from vehicle class====");
        System.out.println("Car is starting with a key or button...");
        System.out.println("====method from vehicle class====");
    }

    @Override
    public void stop() {
    	System.out.println("====method from vehicle class====");
        System.out.println("Car is stopping with brakes...");
        System.out.println("====method from vehicle class====");
    }

    public void openTrunk() {
        System.out.println("Car trunk is now open.");
    }

}
