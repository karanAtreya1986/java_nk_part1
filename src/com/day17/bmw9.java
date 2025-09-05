package com.day17;

public class bmw9 extends car9{
	
	//Cannot override the final method from car9
	//final method cannot be overridden.
////	@Override
//	public final void refuel() {
//        System.out.println("car -- refuel");
//    }
	
	//Cannot override the final method from car9
	public final void refuel() {
        System.out.println("car -- refuel");
    }

}
