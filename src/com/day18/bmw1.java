package com.day18;

public class bmw1 extends car1{
	
	@Override
	 public void start() {
	        System.out.println("bmw -- start");
	    }
	 
	@Override
	 public void start(int a) {
	        System.out.println("bmw -- start with parameter");
	    }
	
	public void autoparking() {
		System.out.println("bmw auto parking");
	}
	
	@Override
	public void applyBreak() {
        System.out.println("bmw -- applyBreak");
    }
	
	//static method.
	//The method billing() of type bmw1 must override or implement a supertype method
//	@Override
//		 public static void billing() {
//		        System.out.println("bmw -- billing");
//		    }
	
	//The method billing() of type bmw1 must override or implement a supertype method
//	@Override
//	public static void billing() {
//        System.out.println("bmw -- billing");
//    }
	
	//Cannot override the final method from car1
	@Override
	public final int getdetails(String name) {
		 System.out.println("car ---- get details method");
		 return 98;
	 }

}
