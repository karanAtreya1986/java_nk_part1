package com.day18;

public class bmw5 extends car5{
	
	@Override
    public void start() {
		System.out.println("====method from car class====");
        System.out.println("BMW is starting with push-button and advanced system...");
        System.out.println("====method from car class====");
    }

    @Override
    public void fuelUp() {
    	System.out.println("====method from vehicle class====");
        System.out.println("BMW requires premium fuel.");
        System.out.println("====method from vehicle class====");
    }

    public void activateSportMode() {
        System.out.println("BMW is now in Sport Mode!");
    }

}
